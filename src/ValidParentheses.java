import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static boolean isValidInput(String s) {
        return s.matches("[(){}\\[\\]]*");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input:");
        String s;
        while (true) {
            s = scanner.nextLine();

            if (isValidInput(s)) {
                break;
            } else {
                System.out.println("pls only (, {, [ and ), }, ].");
            }
        }
        scanner.close();

        if (isValid(s)) {
            System.out.println("result: true");
        } else {
            System.out.println("result: false");
        }
    }

}
