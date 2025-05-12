package codes;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSum {

    public int[] arrCreator(int length) {
        int[] arr = new int[length];
        for(int i = 0; i < length; i++){
            arr[i] = (int)(Math.random()*10);
        }
        return arr;
    }
    static int linearSum(int[] arr){
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        LinearSum ls = new LinearSum();
        Scanner length = new Scanner(System.in);
        System.out.println("Digite a largura do array: ");
        int len = length.nextInt();
        System.out.println("Array: " + Arrays.toString(ls.arrCreator(len)));
        System.out.printf("Soma dos elementos: %d ",linearSum(ls.arrCreator(len)));
    }
}
