import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; ++i) {
            array[i] = sc.nextInt();
        }

        divide(array);

        for (int i = 0; i < n; ++i) {
            System.out.print(array[i] + " ");
        }
    }

    public static void divide(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            if (array[i] % 2 == 0) {
                array[i] = array[i] / 2;
            }
        }
    }
}