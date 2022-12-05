public class Problem1 {
    public static void main(String[] args) {
        int[] nums = {5, 1, 4, 6, 7, 3, 5, 7, 3};
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length -1; j > i; j--) {
                if (nums[i] == nums[j]) {
                    System.out.println(nums[i]);
                }
            }
        }
    }
}
