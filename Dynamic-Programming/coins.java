import java.util.*;
import java.lang.*;

class coins {
    public static int[] coins = { 1, 2, 3, 4, 5 };
    public static int[] cache;
    public static boolean[] valid;

    public static void main(String[] args) {
        int x = 65;
        cache = new int[x + 1];
        valid = new boolean[x + 1];
        System.out.println(itercount(x, cache));
    }

    public static int reccount(int x, int[] cache, boolean[] valid) {
        if (x < 0) {
            return Integer.MAX_VALUE;
        }
        if (x == 0) {
            return 0;
        }
        if (valid[x]) {
            return cache[x];
        }
        int best = Integer.MAX_VALUE;
        for (int coin : coins) {
            if (coin <= x) {
                best = Math.min(best, reccount(x - coin, cache, valid) + 1);
            }

        }
        cache[x] = best;
        valid[x] = true;
        return best;

    }

    public static int itercount(int x, int[] cache) {
        cache[0] = 0;
        for (int i = 1; i <= x; i++) {
            cache[i] = Integer.MAX_VALUE;
            for (int coin : coins) {
                if ((i - coin) >= 0) {
                    cache[i] = Math.min(cache[i], cache[i - coin] + 1);
                }
            }

        }
        return cache[x];
    }

}