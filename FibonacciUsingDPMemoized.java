*import java.util.*;
class fibonacci {
    
    public static int fib(int n, int[] dp) {
        if(dp[n] == -1) {
            if(n <= 1)
                dp[n] = n;
            else
                dp[n] = fib(n-1, dp) + fib(n-2, dp);
        }
        return dp[n];
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(fib(n, dp));
    }
}
