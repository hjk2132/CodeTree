import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        String m = sc.next();

        System.out.println(getStartIndex(n, m));
    }

    public static int getStartIndex(String n, String m) {
        int startIndex = n.indexOf(m);

        return startIndex;
    }
}