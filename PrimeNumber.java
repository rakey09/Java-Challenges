import java.util.Scanner;

/**
 * PrimeNumber
 */
public class PrimeNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 

        System.err.println("Enter the number :");
        int n = s.nextInt();

        int i, m=0, flag = 0;
        m = n / 2;
        if (n==0||n == 1) {
            System.out.println(n + " is not prime Number");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not PrimeNumber");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " is Prime Number");
            }
        }
    }
}
