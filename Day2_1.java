package Day2;

import java.util.Scanner;

public class Day2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int x = a+1; x < b; x++) {
            if (x % 5 == 0 && x % 10 != 0 ) {
                System.out.print(x+" ");
            }
            }
        }
    }