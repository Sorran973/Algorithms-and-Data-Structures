package SortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {
    static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }

    static int[] whileBubbleSort(int[] arr) {
        int counter = 0;
        int n = arr.length;
        boolean flag;
        do {
            flag = false;
            for (int i = 0; i < n-1; i++) {
                counter++;
                if (arr[i] > arr[i+1]) {
                    swap(arr, i, i + 1);
                    flag = true;
                }
            }
        } while (flag);

//        System.out.println(counter);
        return arr;
    }

    static int[] classicBubbleSort(int[] arr) {
        int counter = 0;
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                counter++;
                if (arr[j] > arr[j+1])
                    swap(arr, j, j+1);
            }
        }

        System.out.println(counter);
        return arr;
    }

    static void recursiveBubbleSort(int[] arr, int n) {
        int counter = 0;

        if (n == 1)
            return;

        for (int i = 0; i < n-1; i++) {
            counter++;
            if (arr[i] > arr[i+1]) {
                swap(arr, i, i+1);
            }
        }
        recursiveBubbleSort(arr, n-1);

        System.out.println(counter);
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");

        int[] testArray = {64, 34, 25, 12, 22, 11, 90};
        System.out.println(Arrays.toString(testArray));
        System.out.println(Arrays.toString(whileBubbleSort(testArray)));

    }
}
