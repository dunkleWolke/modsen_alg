import java.util.Scanner;
import java.util.Stack;

public class LongestValidParentheses {

    public static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' ) {
                stack.push(i);
            }
            if (s.charAt(i) == ')' ) {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                }
                else {
                    max = Math.max(max, i - stack.peek());
                }
            }
        }
        return max;
    }

  public static boolean isValidInput(String s) {
        return s.matches("[()]*");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input only ( and ):");
        String s;

        while (true) {
            s = scanner.nextLine();

            if (isValidInput(s)) {
                break;
            } else {
                System.out.println("pls only ( and ).");
            }
        }

        System.out.println("result: " + longestValidParentheses(s));
        scanner.close();
    }
}
