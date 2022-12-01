package SortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {
    static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            swap(array, i, minIndex);
        }

        return array;
    }

    public static void main(String[] args) {
        int[] testArray = {90, 11, 64, 34, 25, 22, 12, 11, 11, 90};
        System.out.println(Arrays.toString(selectionSort(testArray)));
    }
}
