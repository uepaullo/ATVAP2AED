package codes;

import java.util.Scanner;

public class Regua {
    static double converter(double cm)
    {
        return cm/2.54;
    }
    public static void main(String[] args) {
        Scanner cm = new Scanner(System.in);
        System.out.println("Digite um valor em cm: ");
        double cm1 = cm.nextDouble();
        System.out.printf("%.2fcm ≡ %.2f inches",cm1, converter(cm1));

    }
}
