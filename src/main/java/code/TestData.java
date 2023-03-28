package code;

import javax.xml.transform.Source;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * Author:Jude
 * Date:2023-03-27 上午10:08
 */
public class TestData {
    public static void main(String[] args) {

        // twoSum 测试
//        int[] nums = {1,2,5,7};
//        int target = 9;
//        Lc_0001_TwoSum lc_0001_twoSum = new Lc_0001_TwoSum();
//        System.out.println(Arrays.toString(lc_0001_twoSum.twoSum(nums,target)));
//        System.out.println(Arrays.toString(lc_0001_twoSum.twoSumTwoPoint(nums,target)));
//        System.out.println(Arrays.toString(lc_0001_twoSum.twoSumHashMap(nums,target)));

       // 测试hashmap的方法
//        HashMap<Integer, String> hashMap = new HashMap<>();
//        hashMap.put(1,"Google");
//        hashMap.put(2,"a");
//        hashMap.put(3,"B");
//
//        boolean b = hashMap.containsValue("a");
//        System.out.println(b); // true
//        String s = hashMap.get(1); //取 value
//        System.out.println(s);

        //
        String test = "{}()";
//        Deque<Character> stack = new LinkedList<Character>();
//        for (int i = 0; i < test.length(); i++) {
//            char c = test.charAt(i);
//            System.out.println(c);
//        }
//        System.out.println( stack.peek());

        Lc_0020_IsValid lc_0020_isValid = new Lc_0020_IsValid();
        System.out.println(lc_0020_isValid.isValid(test));


    }
}
