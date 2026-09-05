package AtCoderBeginnerContest.A;
import java.util.Scanner;

public class ABC470A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0){
                sb.append("Fizz").append("\n");
            } else {
                sb.append(i).append("\n");
            }
        }
        System.out.print(sb);
    }
}
