import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.List;

public class LongestCommonSubsequence {

    public static List<String> longestCommonSubsequence(String x, String y, int m, int n, int[][] T) {

        if (m == 0 || n == 0)
            return new ArrayList<>(Collections.nCopies(1, ""));

        if (x.charAt(m - 1) == y.charAt(n - 1)) {

            List<String> lcs = longestCommonSubsequence(x, y, m - 1, n - 1, T);

            for (int i = 0; i < lcs.size(); i++)
                lcs.set(i, lcs.get(i) + x.charAt(m - 1));

            return lcs;

        }

        if (T[m][n - 1] > T[m - 1][n])
            return longestCommonSubsequence(x, y, m, n - 1, T);

        List<String> top = longestCommonSubsequence(x, y, m - 1, n, T);
        List<String> left = longestCommonSubsequence(x, y, m, n - 1, T);

        top.addAll(left);

        return top;

    }

    public static void findLength(String x, String y, int[][] T) {

        for (int i = 1; i <= x.length(); i++)
            for (int j = 1; j <= y.length(); j++)
                if (x.charAt(i - 1) == y.charAt(j - 1))
                    T[i][j] = T[i - 1][j - 1] + 1;
                else
                    T[i][j] = Math.max(T[i - 1][j], T[i][j - 1]);

    }

    public static Set<String> longestCommonSubsequence(String x, String y, int[][] T) {

        findLength(x, y, T);
        List<String> lcs = longestCommonSubsequence(x, y, x.length(), y.length(), T);

        return new HashSet<>(lcs);

    }

    public static void main(String[] args) {

        String one = "qpqrr", two = "pqprqrp";
        int T[][] = new int[one.length() + 1][two.length() + 1], x, y;

        TreeSet<String> lcs = new TreeSet<String>(longestCommonSubsequence(one, two, T));
        x = lcs.stream().toArray(String[]::new)[0].length();
        y = lcs.size();

        System.out.println("\nList of the longest common subsequences: " + lcs);
        System.out.println("\nx = " + x + ", y = " + y + "\nx + 10y = " + (x + 10 * y) + ".");

    }

}