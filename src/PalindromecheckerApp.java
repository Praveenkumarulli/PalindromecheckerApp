import java.util.Scanner;

public class PalindromecheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("   Welcome to PalindromeChecker App");
        System.out.println("   Version: 1.0.0");
        System.out.println("=======================================");
        System.out.print("Enter a word to check: ");

        String word = scanner.nextLine();
        String reversed = new StringBuilder(word).reverse().toString();

        if (word.equalsIgnoreCase(reversed)) {
            System.out.println("Result: \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("Result: \"" + word + "\" is not a palindrome.");
        }

        System.out.println("=======================================");
        System.out.println("Program finished.");

        scanner.close();
    }
}
