package week1.day2;

import java.util.Scanner;
public class day2refactor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int N = Integer.parseInt(scan.nextLine());
        int N = scan.nextInt();
        scan.nextLine();
        String[] input = scan.nextLine().split(" ");

        int T = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        for (int i = 0; i < N; i++) {
            M += scan.nextInt();
        }
        T += M / 60;
        M %= 60;
        T %= 24;
        System.out.println(T + " " + M);
    }
}
