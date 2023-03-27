package code;

/**
 * Author:Jude
 * Date:2023-03-27 上午10:08
 */
public class LC_0001_TwoSum {

    //暴力遍历
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (target == nums[i] + nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    //双指针
    public int[] twoSumTwoPoint(int[] nums, int target) {

        int i = 0;
        int j = nums.length - 1;

        while (i < j) { //循环结束条件
            if (target == nums[i] + nums[j]) {
                return new int[]{i, j};
            } else if (target < nums[i] + nums[j]) {
                j--;
            } else {
                i++;
            }
        }
        throw new IllegalArgumentException("no have");
    }
}
