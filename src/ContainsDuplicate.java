import java.util.HashSet;
import java.util.Scanner;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                return true;
            }
            set.add(arr[i]);
        }
        return false;
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

        boolean result = containsDuplicate(nums);
        System.out.println("result: " + result);
        scanner.close();
    }

}
