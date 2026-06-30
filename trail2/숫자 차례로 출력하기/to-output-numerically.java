import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        recursive(1, input);
        System.out.println();
        reRecursive(input);
    }

    public static void recursive(int n, int input) {
        if (n <= input) {
            System.out.print(n + " ");
            recursive((n + 1), input);
        } else {
            return ;
        }
    }

    public static void reRecursive(int n) {
        if (n >= 1) {
            System.out.print(n + " ");
            reRecursive(n - 1);
        } else {
            return ;
        }
    }

}