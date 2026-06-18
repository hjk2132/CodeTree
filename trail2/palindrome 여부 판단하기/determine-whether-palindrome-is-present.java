import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        if (isPalindrome(input)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    public static boolean isPalindrome(String input) {
        int length = input.length();
        boolean isPalindrome = true;

        for (int i = 0; i < (input.length() / 2) - 1; ++i) {
            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome;
    }
}