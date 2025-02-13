import java.util.*;

public class SubSets {

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        generateSubsets(nums, 0, new ArrayList<>(), subsets);
        return subsets;
    }

    private static void generateSubsets(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));
        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);
            generateSubsets(nums, i + 1, current, result);
            current.removeLast();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        while (true) {
            System.out.println("array size: ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n >= 1 && n <= 10) {
                    break;
                }
            } else {
                scanner.next();
            }
            System.out.println("size between 1 and 10.");
        }

        int[] nums = new int[n];
        Set<Integer> uniqueNumbers = new HashSet<>();
        int count = 0;

        System.out.println("input " + n + " unique numbers(between -10 and 10):");
        while (count < n) {
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (num < -10 || num > 10) {
                    System.out.println("input pls a correct number.");
                    continue;
                }
                if (!uniqueNumbers.add(num)) {
                    System.out.println("input pls a unique number.");
                    continue;
                }
                nums[count++] = num;
            } else {
                scanner.next();
                System.out.println("input pls a number.");
            }
        }

        scanner.close();

        List<List<Integer>> result = subsets(nums);
        System.out.println("result:");
        System.out.println(result);
    }
}
