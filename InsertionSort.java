//import java.util.Arrays;

public class InsertionSort implements SortingAlgorithm {

    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public void sort(int[] a) {
        for (int i=1; i<a.length; i++) {
            int j = i;
            while (j>=1 && a[j] < a[j-1]) {
                swap(a, j, j-1);
                j--;
            }
        }
    }
    /*
    public static void main(String args[]) {
        InsertionSort sort = new InsertionSort();
        int[] arr = {9, 46, 2, 1, 3, 43, 28};
        System.out.println(Arrays.toString(arr));
        sort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    */
}