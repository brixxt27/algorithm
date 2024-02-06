package week1.day2;

import java.util.Scanner;
class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int T = scanner.nextInt();
        int M = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            M += scanner.nextInt();
        }
        T += M / 60;
        M %= 60;
        T %= 24;
        System.out.println(T + " " + M);

    }
}