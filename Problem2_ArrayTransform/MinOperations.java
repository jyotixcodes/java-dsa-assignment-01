import java.util.*;

public class MinOperations {

    public static int minOps(int[] A, int K) {
        int n = A.length;

        int rem = A[0] % K;

        for (int x : A) {
            if (x % K != rem) return -1;
        }

        int[] B = new int[n];

        for (int i = 0; i < n; i++) {
            B[i] = (A[i] - rem) / K;
        }

        Arrays.sort(B);

        int median = B[n / 2];
        int ops = 0;

        for (int x : B) {
            ops += Math.abs(x - median);
        }

        return ops;
    }

    public static void main(String[] args) {
        int[] A = {2, 4, 6, 8, 10};
        int K = 2;

        System.out.println(minOps(A, K)); // 6
    }
}