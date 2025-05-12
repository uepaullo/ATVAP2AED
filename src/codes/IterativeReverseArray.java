package codes;

import codes.LinearSum;

import java.util.Arrays;
import java.util.Scanner;

public class IterativeReverseArray {
    static int[] reverseArray(int[] arr) {
        for (int i = 0, j = arr.length-1; i < arr.length / 2; i++,j--) {
            int temp = arr[i], temp1 = arr[j];
            arr[i] = temp1;
            arr[j] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinearSum linearSum = new LinearSum();
        System.out.println("Digite o tamanho do array: ");
        int n = sc.nextInt();
        int arr[] = linearSum.arrCreator(n);
        System.out.printf("Array original: %s\n", Arrays.toString(arr));
        System.out.printf("Array reverso: %s\n", Arrays.toString(reverseArray(arr)));
    }
}
