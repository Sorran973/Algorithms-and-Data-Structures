package SortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {
//
//    static void rearrange(int [] array, int truePosition, int elementIndex) {
//        int temp = array[elementIndex];
//        for (int i = elementIndex; i > truePosition; i--) {
//            array[i] = array[i - 1];
//        }
////        if (elementIndex - truePosition >= 0)
////            System.arraycopy(array, truePosition, array, truePosition + 1, elementIndex - truePosition);
//        array[truePosition] = temp;
//    }
//
//    static void insert(int[] array, int elementIndex) {
//        for (int i = 0; i < elementIndex; i++){
//            if (array[elementIndex] < array[i]) {
//                rearrange(array, i, elementIndex);
//            }
//        }
//    }
    static int[] insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
        return array;
    }


    public static void main(String[] args) {

        int[] testArray = {90, 11, 64, 34, 25, 22, 12, 11, 11, 90};
        System.out.println(Arrays.toString(insertionSort(testArray)));
    }
}
