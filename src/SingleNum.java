import java.util.Scanner;

public class SingleNum {

    public static int singleNum(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("array size: ");
        int size;
        while (true) {
            if (scanner.hasNextInt()) {
                size = scanner.nextInt();
                break;
            } else {
                System.out.println("input pls a number");
                scanner.next();
            }
        }

        int[] nums = new int[size];
        System.out.print("array elements: ");
        for (int i = 0; i < size; i++) {
            while (true) {
                if (scanner.hasNextInt()) {
                    nums[i] = scanner.nextInt();
                    break;
                } else {
                    System.out.println("input pls a number");
                    scanner.next();
                }
            }
        }

        int result = singleNum(nums);
        System.out.println("result: " + result);
        scanner.close();
    }
}
