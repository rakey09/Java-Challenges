import java.util.Scanner;

public class LCMCalculator {
    
    
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
      
        int lcm = lcm(num1, num2);

        
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
        
        scanner.close();
    }
}
