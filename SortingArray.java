package testpackage;


import java.util.Arrays;


public class SortingArray {

    public static void main(String[] args) {

        int arr[] = new int[8];
        sortingArray(arr);
    }

    public static void sortingArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 45);
            System.out.print(arr[i] + ", ");
        }

        Arrays.sort(arr);
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}

