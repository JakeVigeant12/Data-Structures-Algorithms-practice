import java.util.*;

public class IsPalindromicPermutation {
    public static void main(String[] args) {
        System.out.println(palinperm("wew"));
    }

    public static boolean palinperm(String str) {
        HashMap<Character, Integer> counts = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            counts.putIfAbsent(str.charAt(i), 0);
            counts.put(str.charAt(i), counts.get(str.charAt(i)) + 1);
        }
        int ocount = 0;
        for (char c : counts.keySet()) {
            if (counts.get(c) % 2 != 0) {
                ocount++;
                if (ocount > 1) {
                    return false;
                }
            }
        }
        return true;

    }
}
