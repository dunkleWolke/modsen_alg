import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int rev = 0;
        int orig = x;
        while(x != 0){
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        return rev == orig;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        while (true) {
            System.out.print("X: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                break;
            } else {
                System.out.println("input pls a number");
                scanner.next();
            }
        }
        System.out.println("result: " + isPalindrome(number));
        scanner.close();
    }
}
