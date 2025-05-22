import java.util.Scanner;

public class PalindromeChecker {

    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase for uniformity
        String cleanedString = str.replaceAll("\\s+", "").toLowerCase();
        // Get the length of the cleaned string
        int length = cleanedString.length();
        
        // Check if the cleaned string is equal to its reverse
        for (int i = 0; i < length / 2; i++) {
            if (cleanedString.charAt(i) != cleanedString.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        // Check if the string is a palindrome
        if (isPalindrome(inputString)) {
            System.out.println("\"" + inputString + "\" is a palindrome.");
        } else {
            System.out.println("\"" + inputString + "\" is not a palindrome.");
        }
        
        scanner.close();
    }
}