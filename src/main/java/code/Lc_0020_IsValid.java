package code;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Author:Jude
 * Date:2023-03-28 上午11:33
 * s = "[](){}"
 */
public class Lc_0020_IsValid {
    public boolean isValid(String s) {
        int n = s.length();
        if (s.length() % 2 == 1 ) {
            return false;
        }

        Map<Character, Character> characterHashMap = new HashMap<>();
        characterHashMap.put('}','{');
        characterHashMap.put(')','(');
        characterHashMap.put(']','[');

        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (characterHashMap.containsKey(c)){
                if (stack.isEmpty() || stack.peek() != characterHashMap.get(c)) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
