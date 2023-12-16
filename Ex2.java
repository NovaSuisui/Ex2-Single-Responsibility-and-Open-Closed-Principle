import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Ex2 {
    public static final int MAX = 5;

    public static List<Integer> inputString(List<Integer> nums) {
        Scanner inp = new Scanner(System.in);

        while (nums.size() < MAX) {
            String s = inp.nextLine();
            int num;

            if (checkType(s)) {
                num = Integer.parseInt(s);
                if(!chenkRange(num)) {
                    continue;
                }
            }
            else {
                continue;
            }

            nums.add(num);
        }

        inp.close();

        return nums;
    }

    public static boolean checkType(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid! Try again!");
            return false;
        }
        return true;
    }

    public static boolean chenkRange(int num) {
        if (num < 0 || num > 10) {
            System.out.println("Invalid range! Try again!");
            return false;
        }
        return true;
    }

    public static List<Integer> sortNumList(List<Integer> nums) {
        Collections.sort(nums);
        return nums;
    }

    public static void printNum(List<Integer> nums) {
        for (int num : nums)
            System.out.print(num + " ");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Application!");

        List<Integer> nums = new ArrayList<>();

        System.out.println("Enter 5 valid integers in the range [0, 10]");

        nums = inputString(nums);
        nums = sortNumList(nums);
        printNum(nums);
    }
}