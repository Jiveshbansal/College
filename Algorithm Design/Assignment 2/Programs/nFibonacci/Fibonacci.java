import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Fibonacci {

    public static int getFibonacciNumber(int n) {

        int[] fibonacci = new int[n + 2];
        fibonacci[1] = 1;

        IntStream.range(2, n + 1).forEach(i -> fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2]);

        return fibonacci[n];
    }

    public static void main(String args[]) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter n: ");
        int number = Integer.parseInt(reader.readLine());
        System.out.println("\n\nFibonacci #" + number + " = " + getFibonacciNumber(number) + ".");

    }

}