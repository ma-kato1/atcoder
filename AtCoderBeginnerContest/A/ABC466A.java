package AtCoderBeginnerContest.A;
import java.util.Scanner;

public class ABC466A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        
        String ans = "Yes";
        for (int i = 0; i < N; i++){ 
            int X = sc.nextInt();
            if (X >= 0) {
                ans = "No";
                break;
            }
        }

        System.out.println(ans);
    }
}