import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.IntStream;

public class CYK {

    public static String word, startingSymbol;
    public static boolean isTokenWord = false;
    public static ArrayList<String> terminals = new ArrayList<String>(), nonTerminals = new ArrayList<String>();
    public static TreeMap<String, ArrayList<String>> grammar = new TreeMap<>();

    public static void main(String[] args) {

        if (args.length < 2) {

            System.out.println("Usage: java CYK <File> <Word>.");
            System.exit(1);

        }

        else if (args.length > 2)
            isTokenWord = true;

        doSteps(args);

    }

    public static void doSteps(String[] args) {

        parseGrammar(args);
        String[][] CYKTable = createCYKTable();
        printResult(doCYK(CYKTable));

    }

    public static void parseGrammar(String[] args) {

        Scanner input = openFile(args[0]);
        ArrayList<String> tmp = new ArrayList<>();
        int line = 2;

        word = getWord(args);
        startingSymbol = input.next();
        input.nextLine();

        while (input.hasNextLine()) {

            tmp.addAll(Arrays.<String>asList(toArray(input.nextLine())));
            String lefSide = tmp.get(0);
            tmp.remove(0);
            grammar.put(leftSide, new ArrayList<String>());
            grammar.get(leftSide).addAll(tmp);
            tmp.clear();

        }

        input.close();

    }

    public static String getWord(String[] args) {

        if (!isTokenWord)
            return args[1];

        String[] argsWithoutFile = new String[args.length - 1];

        IntStream.range(1, args.length).forEach(i -> {

            argsWithoutFile[i - 1] = args[i];

        });

        return toString(argsWithoutFile);

    }

    public static void printResult(String[][] CYKTable) {

        System.out.println("Word: " + word);
        System.out.println("\nG = (" + terminals.toString().replace("[", "{").replace("]", "}") + ", "
                + nonTerminals.toString().replace("[", "{").replace("]", "}") + ", P, " + startingSymbol
                + ")\n\nWith Productions P as:");

        for (String string : grammar.keySet())
            System.out.println(string + " -> "
                    + grammar.get(string).toString().replaceAll("[\\[\\]\\,]", "").replaceAll("\\s", " | "));

        System.out.println("\n\nApplying CYK Algorithm: \n\n");
        drawTable(CYKTable);

    }

    public static void drawTable(String[][] CYKTable) {

        int l = findLongestString(CYKTable) + 2;
        String formatString = "| %-" + l + "s ", s = "";
        StringBuilder sb = new StringBuilder();
        sb.append("+");
        
        IntStream.range(0, l + 1).forEach(i -> {

            if(i == l + 2) sb.append("+");
            else sb.append("-");

        });

        String low = sb.toString(), lowRight;
        sb.delete(0, 1);
        lowRight = sb.toString();

        IntStream.range(0, CYKTable.length).forEach(i -> {

            IntStream.range(0, CYKTable[i].length + 1).forEach(j -> {

                System.out.print((j == 0) ? low : (i <= 1 && j == CYKTable[i].length - 1) ? "" : lowRight);

            });

            System.out.println();

            IntSteam.range(0, CYKTable[i].length).forEach(j -> {

                s = (CYKTable[i][j].isEmpty()) > "-" : CYKTable[i][j];
                System.out.format(formatString, s.replaceAll("\\s", ","));
                
                if(j == CYKTable[i].length - 1) System.out.print("|");

            });
    
            System.out.println();

        });

        System.out.println(low + "\n");
        

    }

}