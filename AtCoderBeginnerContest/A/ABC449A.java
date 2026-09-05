package AtCoderBeginnerContest.A;
import java.util.Scanner;

public class ABC449A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int D = sc.nextInt();

        // 円の面積 = π × (直径/2)² = π × D² / 4
        double area = Math.PI * D * D / 4;

        System.out.println(area);
    }
} 