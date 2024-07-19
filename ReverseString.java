public class ReverseString {
    public static void main(String[] args) {
    // Example usage of the reverseString method
        System.out.println("gashFJGKJAJACGJCJFACGKACKGA");
    String example1 = ReverseString.reverseString("codedamn");
    String example2 = ReverseString.reverseString("123");

    // Output the results
        System.out.println(example1); // Expected output: nmadedoc
        System.out.println(example2); // Expected output: 321
}


// the method should accept a string and return a string
public static String reverseString(String str) {
        String reverse ="";
      for(int i = str.length()-1;i>=0;i--){
           reverse = reverse+str.charAt(i);
      }


return reverse;
}
}
