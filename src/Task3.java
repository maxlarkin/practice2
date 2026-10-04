import java.util.Scanner;

public class Task3 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int counter = 0;

        while (n > 0) {
            if (n % 2 == 1) {
                counter++;
            }
            n /= 10;
        }
        System.out.println(counter);
    }
}
