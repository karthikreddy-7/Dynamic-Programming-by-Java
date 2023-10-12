
//this program outputs the Nth term of fibonacci series using Dynamic Programming With Memoization
import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Nth term:");
        int n = sc.nextInt();
        int res = fib(n);
        System.out.println("the " + n + "th Fibonacci Term is " + res);
        sc.close();
    }

    public static int fib(int n) {
        return fib(n, new HashMap<>());
    }

    public static int fib(int n, HashMap<Integer, Integer> memo) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int result = fib(n - 1, memo) + fib(n - 2, memo);
        memo.put(n, result);
        return result;
    }
}