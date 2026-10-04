import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            greeting();
            int state;
            try {
                state = scanner.nextInt();
            } catch (Throwable _) {
                state = -1;
            }

            switch (state) {
                case 0:
                    return;
                case 1:
                    sortArray();
                    break;
                case 2:
                    progInfo();
                    break;
                case 3:
                    authorInfo();
                    break;
                default:
                    System.out.println("Введенное значение некорректно");
            }

        }

    }

    static void greeting() {
        System.out.print("""
                Выберите действие:
                0 - выход
                1 - выполнить расчет
                2 - информация о программе
                3 - информация о разработчике
                Напишите номер выбранной опции >>\s""");
    }

    static void sortArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите массив чисел, разделенных пробелом >>\s");

        String input = scanner.nextLine();
        String[] splInp = input.split(" ");

        int[] arr;

        try {
            arr = Arrays.stream(splInp)
                    .mapToInt(Integer::parseInt)
                    .toArray();
        } catch(Throwable _) {
            System.out.println("Был введен невалидный массив.");
            return;
        }


        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr)); // [1, 2, 4, 5, 8]
    }

    static void progInfo() {
        System.out.println("Info: Программа написана для выполнения практического задания номер 2 и сортировки предоставленного массива пузырьковым методом.");
    }

    static void authorInfo() {
        System.out.println("Info: This program has been reading by Larkin Maxim from RI-250911 UrFU");
    }
}