public class PalindromeString {
    
        public static void main(String[] args) {
            System.out.println(isPalindrome("radar")); // Output: true
            System.out.println(isPalindrome("Java")); // Output: false
            System.out.println(isPalindrome("Madam")); // Output: true
            System.out.println(isPalindrome("Hello, World!")); // Output: false
        }
    
        public static boolean isPalindrome(String str) {
            String revString = "";
            for(int i = str.length()-1;i >= 0;i--){
                revString = revString+str.charAt(i);
            }
            if (str.toLowerCase().equals(revString.toLowerCase())) {
                return true;
                
            }else{
                return false;
            }
        }
    }
    
    

