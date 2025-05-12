package codes;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    static void reverseArray(int[] arr, int start, int end) {
        if (start >= end) return;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {
        LinearSum linearSum = new LinearSum();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do array: ");
        int[] arr = linearSum.arrCreator(sc.nextInt());
        System.out.printf("Array original: %s\n", Arrays.toString(arr));
        reverseArray(arr, 0, arr.length - 1);
        System.out.printf("Array inverso: %s\n", Arrays.toString(arr));
    }
}
