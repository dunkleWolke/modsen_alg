import java.util.Scanner;

public class SearchInsertPos {

    public static int searchInsertPos(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                start = mid + 1;
            }
            if (nums[mid] > target) {
                end = mid - 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("array size: ");
        int size;
        while (true) {
            if (scanner.hasNextInt()) {
                size = scanner.nextInt();
                if (size >= 1 && size <= 10000) break;
                System.out.println("size between 1 and 10^4");
            } else {
                System.out.println("input pls a number");
                scanner.next();
            }
        }

        int[] nums = new int[size];
        System.out.print("array elements (sorted and distinct): ");
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
        int target;
        while (true) {
            if (scanner.hasNextInt()) {
                target = scanner.nextInt();
                break;
            } else {
                System.out.println("input pls a number");
                scanner.next();
            }
        }

        int result = searchInsertPos(nums, target);
        System.out.println("insert pos: " + result);

        scanner.close();
    }
}
