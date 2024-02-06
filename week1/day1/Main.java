package week1.day1;

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W = scanner.nextInt();
        int R = scanner.nextInt();
        int RM = (int)(W * (1 + (double)R / 30));

        System.out.println(RM);
    }
}