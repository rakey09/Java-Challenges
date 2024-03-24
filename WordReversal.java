public class WordReversal {
    public static void main(String[] args) {
        // Original string
        String str = "Dog bites man";
        
        // Split the string into an array of words
        String arr[] = str.split(" ");
        
        // Variable to store the reversed string
        String reverse = "";
        
        // Iterate through the array of words in reverse order
        for (int i = arr.length - 1; i >= 0; i--) {
            // Append each word to the reversed string
            reverse += arr[i] + " ";
        }
        
        // Print the reversed string
        System.out.println("Reverse String: " + reverse.trim());
    }
}


