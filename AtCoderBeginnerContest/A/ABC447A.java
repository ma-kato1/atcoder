package AtCoderBeginnerContest.A;
import java.util.Scanner;

public class ABC447A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 6
        int M = sc.nextInt(); // 3

        if (M * 2 -1 <= N) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}