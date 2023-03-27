package code;

import java.util.Arrays;

/**
 * Author:Jude
 * Date:2023-03-27 上午10:08
 */
public class TestData {
    public static void main(String[] args) {
        //
        int[] nums = {1,2,5,7};
        int target = 9;
        LC_0001_TwoSum lc_0001_twoSum = new LC_0001_TwoSum();
        System.out.println(Arrays.toString(lc_0001_twoSum.twoSum(nums,target)));


    }
}
