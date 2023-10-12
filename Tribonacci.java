//Tribonacci series with DP Memoization

import java.util.*;

public class Tribonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the Nth Term:");
        int n = sc.nextInt();
        HashMap<Integer, Integer> memo = new HashMap<>();
        int result = trib(n, memo);
        System.out.println("the " + n + "th term of tribonacci series is " + result);
        sc.close();
    }

    public static int trib(int n, HashMap<Integer, Integer> memo) {
        if (n <= 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int res = trib(n - 1, memo) + trib(n - 2, memo) + trib(n - 3, memo);
        memo.put(n, res);
        return res;
    }
}
