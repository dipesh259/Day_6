package Day_06;
import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0){
            System.out.println("It is Prime Number");
        }
        else {
            System.out.println("It's not a Prime Number");
        }
    }
}
