package day2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int T = scanner.nextInt();
        int M = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            int c = scanner.nextInt();

            M += c;
        }
        T += M / 60;
        M %= 60;
        T %= 24;
        System.out.println(Integer.toString(T) + " " + Integer.toString(M));
    }
}
