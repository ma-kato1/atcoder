package AtCoderBeginnerContest.A;
import java.util.Scanner;

public class ABC467A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();

        double h = H / 100.0;
        double bmi = W / h / h;

        if (bmi >= 25){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    
}
