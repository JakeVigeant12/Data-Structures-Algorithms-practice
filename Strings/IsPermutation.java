import java.util.*;

public class IsPermutation {
    public static void main(String[] args) {
        String str1 = "amazon";
        String str2 = "zamaon";
        System.out.println(perm(str1, str2));
    }

    public static boolean perm(String str1, String str2) {
        int[] charSet = new int[128];
        for (int i = 0; i < str1.length(); i++) {
            charSet[str1.charAt(i)]++;
        }
        for (int i = 0; i < str2.length(); i++) {
            charSet[str2.charAt(i)]--;
            if (charSet[str2.charAt(i)] < 0) {
                return false;
            }
        }
        return true;
    }
}
