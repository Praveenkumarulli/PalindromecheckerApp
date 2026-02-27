import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromecheckerApp {
    public static void main(String[] args) {
        String word = "madam";
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            queue.add(c);
            stack.push(c);
        }

        boolean isPalindrome = true;
        while (!queue.isEmpty() && !stack.isEmpty()) {
            if (queue.remove() != stack.pop()) {
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
