

public class QuickSort implements SortingAlgorithm {

    public void sort(int[] a) {
        qs(a, 0, a.length-1);
    }

    private void qs(int[] a, int left, int right) {
        if (left < right) {
            int p = partition(a, left, right);
            qs(a, left, p-1);
            qs(a, p+1, right);
        }
    }

    private void swap(int[] arr, int a, int b) {
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }

    private int partition(int[] a, int left, int right) {
        
        int pivot_idx = right;
        int i = left - 1;

        for (int j=left; j<right; j++){  
            if (a[j] < a[pivot_idx]) { 
                i++; 
                swap(a, i, j); 
            } 
        }
        swap(a, pivot_idx, i+1);

        return (i + 1);
    }
    
}