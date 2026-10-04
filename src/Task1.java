import java.util.Scanner;

public class Task1 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int y = 0;

        for (int i = n; i <= 2*n; i++) {
            y += i ^ 2;
        }
        System.out.println(y);
    }
}
