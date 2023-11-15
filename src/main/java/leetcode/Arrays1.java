package leetcode;

public class Arrays1 {

    /*
    2 <= nums.length <= 104
    -109 <= nums[i] <= 109
    -109 <= target <= 109
     */

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}
