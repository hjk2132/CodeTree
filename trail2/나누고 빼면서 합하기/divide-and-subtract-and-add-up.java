import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n + 1];
        // [sum, m]
        int[] sumNm = new int[2];

        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        
        sumNm[1] = m;

        while(sumNm[1] >= 1) {
            getNextM(arr, sumNm);
        }

        System.out.println(sumNm[0]);
    }

    public static void getNextM(int[] arr, int[] sumNm) {
        if (sumNm[1] % 2 != 0) {
            sumNm[0] = sumNm[0] + arr[sumNm[1]];
            sumNm[1] = sumNm[1] - 1;
        } else {
            sumNm[0] = sumNm[0] + arr[sumNm[1]];
            sumNm[1] = sumNm[1] / 2;
        }
    }

}