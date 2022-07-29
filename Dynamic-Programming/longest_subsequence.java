
public class longest_subsequence {
    static int[] arr;
    static int[] counts;

    public static void main(String[] args) {
        arr = new int[] { 1, 5, 5, 6, 32, 12, 9 };
        counts = new int[arr.length];
        System.out.println(subseq(arr, counts));
    }

    public static int subseq(int[] arr, int[] counts) {
        counts[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            counts[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    counts[i] = Math.max(counts[i], counts[j] + 1);
                }

            }

        }
        int max = 0;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > max) {
                max = counts[i];
            }
        }
        return max;
    }
}
