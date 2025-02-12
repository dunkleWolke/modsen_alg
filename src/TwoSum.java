import java.util.Scanner;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
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

        System.out.print("target: ");
        int target = scanner.nextInt();
        int[] result = twoSum(nums, target);
        if (result != null) {
            System.out.println("result: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("not found");
        }
        scanner.close();
    }
}
