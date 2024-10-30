import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N + 1];
        int[] record = new int[N + 1];

        for(int i=2; i<=N; i++) {
            dp[i] = dp[i-1] + 1;
            record[i] = i-1;

            if(i % 2 == 0 && dp[i / 2] + 1 < dp[i]) {
                dp[i] = dp[i / 2] + 1;
                record[i] = i/2;
            }

            if(i % 3 == 0 && dp[i / 3] + 1 < dp[i]) {
                dp[i] = dp[i / 3] + 1;
                record[i] = i/3;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(dp[N]).append("\n");

        while(N>0){
            sb.append(N+ " ");
            N = record[N];
        }
        System.out.println(sb);
    }
}