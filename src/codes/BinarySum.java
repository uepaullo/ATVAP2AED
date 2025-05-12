package codes;

import java.util.Scanner;

public class BinarySum {
    static void binarySum(int a, int b) {
        System.out.printf("%d + %d = 0b%s\n", a, b,Integer.toBinaryString(a+b));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int a = sc.nextInt();
        System.out.println("Digite outro numero: ");
        int b = sc.nextInt();
        binarySum(a,b);
    }
}
