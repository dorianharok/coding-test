import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        ArrayDeque<Character> stack = new ArrayDeque<>();
        int answer = 0;
        char prev = ' ';
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);

            switch(c) {
                case '(' -> stack.push(c);
                case ')' -> {
                    if(prev == '(') {
                        stack.pop();
                        answer += stack.size();
                    }

                    else {
                        stack.pop();
                        answer++;
                    }
                }
            }

            prev = c;
        }

        System.out.println(answer);
    }
}