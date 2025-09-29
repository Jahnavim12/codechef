import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
            int max = 0, total = n * m;

            for (int i = 1; i < n; i++) {
                int a = i * m, b = (n - i) * m;
                if (a >= k) max = Math.max(max, b);
                if (b >= k) max = Math.max(max, a);
            }

            for (int j = 1; j < m; j++) {
                int a = n * j, b = n * (m - j);
                if (a >= k) max = Math.max(max, b);
                if (b >= k) max = Math.max(max, a);
            }

            if (k == 0) max = Math.max(max, total);
            System.out.println(max);
        }
        sc.close();
    }
}
