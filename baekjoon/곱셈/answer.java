import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int A,B,C;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        System.out.println(pow(A, B));
    }

    public static long pow(int a, int exponent) {
        if(exponent == 1) {
            return a % C;
        }

        long temp = pow(a, exponent / 2);

        if(exponent % 2 == 1) {
            return (temp * temp % C) * A % C;
        }

        return temp * temp % C;
    }
}