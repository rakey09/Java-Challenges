import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        int number ;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number :");
        number = s.nextInt();

        int reverseNumber = 0, temp = number;
        while (temp >0){
            int reverse = temp % 10;
            reverseNumber = reverseNumber *10 + reverse;
            temp = temp/10;
        }
        if (reverseNumber == number){
            System.out.println(number+" is Palindrome Number");
        }else {
            System.out.println(number+" is not Palindrome Number");
        }
  
    }
    
}
