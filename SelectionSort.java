import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        // Example array to be sorted
        int[] array = {64, 25, 12, 22, 11};
        
        System.out.println("Original array: " + Arrays.toString(array));
        
        // Call the selection sort method
        selectionSort(array);
        
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    // Method to perform selection sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Update minIndex if a smaller element is found
                }
            }

            // Swap the found minimum element with the first element
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }
}

