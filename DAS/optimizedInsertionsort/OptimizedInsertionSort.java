
package Submission05.optimizedInsertionsort;

public class OptimizedInsertionSort {
    
    public static void optInsertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Shift only when needed (optimized)
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 5, 1, 4, 3};
        optInsertionSort(arr);

        for (int x : arr)
            System.out.print(x + " ");
    }
    
}
