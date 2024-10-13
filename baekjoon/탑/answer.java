import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int[] arr = new int[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1; i<=N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] answer = new int[N+1];
        for(int i=N; i>=1; i--) {
            while(!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                answer[stack.pop()] = i;
            }

            stack.push(i);
        }

        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=N; i++) {
            sb.append(answer[i]+" ");
        }
        System.out.println(sb);
    }
}