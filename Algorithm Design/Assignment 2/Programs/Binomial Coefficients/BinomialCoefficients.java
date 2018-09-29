import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.stream.IntStream;

/**
 * BinomialCoefficients
 */
public class BinomialCoefficients {

    public static BigInteger getCoefficient(int n, int r) {

        BigInteger[] coefficient = new BigInteger[n + 1];

        coefficient[0] = BigInteger.ONE;

        IntStream.range(1, n + 1).forEach(i -> {

            coefficient[i] = BigInteger.ONE;
            IntStream.iterate(i - 1, e -> e - 1).limit(i - 1).forEach(j -> {

                coefficient[j] = coefficient[j].add(coefficient[j - 1]);

            });

        });

        return coefficient[r];

    }

    public static void main(String args[]) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n, r;

        System.out.print("\nEnter n: ");
        n = Integer.parseInt(reader.readLine());
        System.out.print("\nEnter r: ");
        r = Integer.parseInt(reader.readLine());

        System.out.println("\n\nBinomial coefficient (n, r) = " + getCoefficient(n, r) + ".");

    }

}