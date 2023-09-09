import java.util.*;

public class ACherry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            long[] arr = new long[n]; // Use long instead of int for the array
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextLong(); // Use nextLong() for long values
            }
            long ans = Long.MIN_VALUE; // Use Long.MIN_VALUE for long
            for (int i = 0; i < n - 1; i++) {
                ans = Math.max(arr[i] * arr[i + 1], ans);
            }
            System.out.println(ans);
        }
    }
}
