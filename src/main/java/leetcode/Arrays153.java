package leetcode;

public class Arrays153 {

    /*
    n == nums.length
    1 <= n <= 5000
    -5000 <= nums[i] <= 5000
    All the integers of nums are unique.
    nums is sorted and rotated between 1 and n times.
    */

    public static int findMin(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        var maxNumberIndex = 0;
        var minNumberIndex = nums.length - 1;
        if (nums[minNumberIndex] > nums[maxNumberIndex]) {
            return nums[maxNumberIndex];
        }
        while (minNumberIndex != maxNumberIndex + 1) {
            var nextIndex = (maxNumberIndex + minNumberIndex) / 2;
            if (nums[nextIndex] > nums[maxNumberIndex]) {
                maxNumberIndex = nextIndex;
            } else {
                minNumberIndex = nextIndex;
            }
        }
        return nums[minNumberIndex];
    }
}
