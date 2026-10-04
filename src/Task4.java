import java.util.Scanner;

public class Task4 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextLong();
        double res = 0;

        for (int i = 2; i <= 6; i += 2) {
            res += Math.pow(a, i);
        }

        System.out.println(res);
    }
}
