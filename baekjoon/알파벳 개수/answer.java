import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] arr = new int[26];

        for(char c : s.toCharArray()) {
            arr[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for(int count : arr) {
            sb.append(count).append(" ");
        }

        System.out.println(sb);
    }
}