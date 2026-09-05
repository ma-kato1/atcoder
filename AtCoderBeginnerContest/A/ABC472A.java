package AtCoderBeginnerContest.A;
import java.util.Scanner;;

public class ABC472A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < S.length(); i++) {
            ans.append(S.charAt(i) == 'A' ? "A" : ".");
        }

        System.out.println(ans);
    }
}