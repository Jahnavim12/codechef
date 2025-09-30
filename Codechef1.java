import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef1 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int c = 0;
            boolean h = false;
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                    c++;
                    if (c >= 4) {
                        h = true;
                        break;
                    }
                } else {
                    c = 0;
                }
            }
            System.out.println(h ? "NO" : "YES");
        }
        sc.close();
    }
}
