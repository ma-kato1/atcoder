package AtCoderBeginnerContest.A;
import java.util.Scanner;

public class ABC471A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        boolean hasnine = (A + B == 9 || A - B == 9 || A * B == 9 || A == B * 9);

        System.out.println(hasnine ? "Nine" : "Nein");
    }
}
