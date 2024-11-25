import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while(N > 1) {
            int n = 2;
            while(N % n != 0) {
                n++;
            }
            N /= n;
            sb.append(n).append("\n");
        }

        System.out.println(sb);
    }
}