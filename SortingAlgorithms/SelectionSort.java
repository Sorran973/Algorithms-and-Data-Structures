package SortingAlgorithms;

import java.util.Arrays;

/**
 * In Selection sort, a maximum of n swap operations are required,
 * whereas in Bubble Sort, up to n swap operation happens for each
 * element, so up to n2 total swap operation are required. These
 * swap (write) operations are memory-intensive, so Selection sort
 * becomes even more efficient than Bubble sort for large lists.
 */

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
