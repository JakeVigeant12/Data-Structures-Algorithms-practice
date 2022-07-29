import java.util.*;

public class IsUnique {
    static boolean[] charset = new boolean[128];

    public static void main(String[] args) {
        String s = "wea";
        System.out.println(unique(s));
    }

    public static boolean unique(String str) {
        Set<Character> test = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (charset[(int) str.charAt(i)]) {
                return false;
            }
            charset[(int) str.charAt(i)] = true;
        }
        return true;
    }
}
