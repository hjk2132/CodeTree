import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        
        if (isDifferent(A, 2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    public static boolean isDifferent(String input, int threshold) {
        int[] array = new int[26];
        int count = 0;

        for (int i = 0; i < input.length(); ++i) {
            int c = input.charAt(i) - 'a';

            if (array[c] == 0) {
                array[c] = 1;
                count = count + 1;
            }

            if (count >= threshold) {
                return true;
            }
        }

        return false;
    }
}