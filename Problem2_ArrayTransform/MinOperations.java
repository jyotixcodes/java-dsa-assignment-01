import java.util.*;

public class MinOperations {
    public static int minOps(int[] A, int K) {
        
        for (int x : A) {
            if ((x - A[0]) % K != 0) {
                return -1; // Not possible
            }
        }
        int n = A.length;
        int[] steps = new int[n];
        for (int i = 0; i < n; i++) {
            steps[i] = A[i] / K;
        }
        Arrays.sort(steps);

        int median = steps[n / 2];

        int totalOps = 0;
        for (int x : steps) {
            totalOps += Math.abs(x - median);
        }

        return totalOps;
    }

    public static void main(String[] args) {
        int[] A = {2, 4, 6, 8, 10};
        int K = 2;
        System.out.println("Minimum Operations: " + minOps(A, K)); // 6
    }
}
