public class PalindromecheckerApp {
    public static void main(String[] args) {
        String word = "A man a plan a canal Panama";

        String normalized = word.replaceAll("\\s+", "").toLowerCase();
        boolean isPalindrome = true;

        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("=======================================");
        System.out.println("   Welcome to PalindromeChecker App");
        System.out.println("   Version: 1.0.0");
        System.out.println("=======================================");
        System.out.println("Checking phrase: " + word);

        if (isPalindrome) {
            System.out.println("Result: \"" + word + "\" is a palindrome (case-insensitive, spaces ignored).");
        } else {
            System.out.println("Result: \"" + word + "\" is not a palindrome.");
        }

        System.out.println("=======================================");
        System.out.println("Program finished.");
    }
}
