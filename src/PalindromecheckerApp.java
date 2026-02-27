public class PalindromecheckerApp {
    public static void main(String[] args) {
        String word = "madam";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        System.out.println("=======================================");
        System.out.println("   Welcome to PalindromeChecker App");
        System.out.println("   Version: 1.0.0");
        System.out.println("=======================================");
        System.out.println("Checking word: " + word);

        if (word.equals(reversed)) {
            System.out.println("Result: \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("Result: \"" + word + "\" is not a palindrome.");
        }

        System.out.println("=======================================");
        System.out.println("Program finished.");
    }
}