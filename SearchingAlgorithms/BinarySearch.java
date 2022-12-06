package SearchingAlgorithms;


public class BinarySearch {

     static int recursiveBinarySearch(int[] sortedArray, int desiredElement, int start, int end) {
        if (end >= start) {
            int middle = (end - start) / 2 + start;
            if (desiredElement == sortedArray[middle])
                return middle;
            if (desiredElement < sortedArray[middle])
                return recursiveBinarySearch(sortedArray, desiredElement, start, middle - 1);
            else
                return recursiveBinarySearch(sortedArray, desiredElement, middle + 1, end);
        }

        return -1;
    }
     static int binarySearch(int[] sortedArray, int desiredElement) {
        int n = sortedArray.length;
        int start = 0;
        int end = n - 1;
        int middle;

        do {
            middle = (end - start) / 2 + start;
            if (desiredElement == sortedArray[middle])
                return middle;
            if (desiredElement < sortedArray[middle])
                end = middle - 1;
            if (desiredElement > sortedArray[middle])
                start = middle + 1;
        } while (end >= start);

        return -1;
    }


    public static void main(String[] args) {
        int[] sortedArray = {11, 11, 11, 12, 22, 25, 34, 64, 90, 90};
        int desiredElement = 11;
        System.out.println(binarySearch(sortedArray, desiredElement));
        System.out.println(recursiveBinarySearch(sortedArray, desiredElement, 0, sortedArray.length-1));
    }
}
