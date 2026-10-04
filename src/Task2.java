import java.util.Scanner;

public class Task2 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        int n = scanner.nextInt();
        double res = 0;

        System.out.println("expected: " + Math.atan(x));

        for (int i = 0; i <= n; i++) {
            res += Math.pow(-1, i) * Math.pow(x, (2*i + 1)) / (2*i + 1);
        }
        System.out.println("result: " + res);
    }
}
