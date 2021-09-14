package Day_06;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fib, f1, f2;

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        f1 = n - 1;
        f2 = n - 2;

        fib = f1 + f2;
        System.out.println(fib);

    }
    }