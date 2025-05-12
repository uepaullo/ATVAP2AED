package codes;

import java.util.Scanner;

public class RecursiveFactorial {

   public static int factorial(int n) {
        if(n==1) return 1;
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = sc.nextInt();
        System.out.printf("%d! = %d%n",n, factorial(n));
    }
}
