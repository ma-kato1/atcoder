package AtCoderBeginnerContest.A;
import java.util.Scanner;

public class ABC445A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        if (S.charAt(0) == S.charAt(S.length() - 1)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
