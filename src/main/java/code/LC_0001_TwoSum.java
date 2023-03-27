package code;

/**
 * Author:Jude
 * Date:2023-03-27 上午10:08
 */
public class LC_0001_TwoSum {

    //暴力遍历
    public static int[] twoSum(int[] nums, int target) {

        int i = 0;
        int j = nums.length;

        for (int k = 0; k < j; k++) {
            for (int l = k + 1; l < j; l++) {
                if (target == nums[k] + nums[l]) {
                    return new int[]{k, l};
                }
            }
        }
        return null;
    }
}
