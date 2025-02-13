import java.util.Scanner;

public class MaximumSubarray {

    public static int maxSubarray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(currentSum + nums[i], nums[i]);
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
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

        int result = maxSubarray(nums);
        System.out.println("result: " + result);
    }
}
