package codes;

import java.util.Scanner;

public class BinaryFib {
    static int fib(int n) {
        if (n<=1) return 1;
        return fib(n - 1) + fib(n - 2);
    }
    static void binaryPrint(int n) {
        System.out.printf("%d = %s",fib(n),Integer.toBinaryString(n));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = sc.nextInt();
        binaryPrint(n);
    }
}
