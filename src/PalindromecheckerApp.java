import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromecheckerApp {
    public static void main(String[] args) {
        String word = "madam";
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : word.toCharArray()) {
            deque.add(c);
        }

        boolean isPalindrome = true;
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("=======================================");
        System.out.println("   Welcome to PalindromeChecker App");
        System.out.println("   Version: 1.0.0");
        System.out.println("=======================================");
        System.out.println("Checking word: " + word);

        if (isPalindrome) {
            System.out.println("Result: \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("Result: \"" + word + "\" is not a palindrome.");
        }

        System.out.println("=======================================");
        System.out.println("Program finished.");
    }
}
