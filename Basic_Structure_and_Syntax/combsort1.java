package Basic_Structure_and_Syntax;

import java.util.Arrays; // <-- ADD THIS LINE HERE

public class combsort1 {
    public static void combSort(int[] arr) {
        int gap = arr.length;
        boolean swapped = true;
        
        while (gap > 1 || swapped) {
            gap = Math.max(1, (gap * 10) / 13);
            swapped = false;
            
            for (int i = 0; i < arr.length - gap; i++) {
                if (arr[i] > arr[i + gap]) {
                    int temp = arr[i];
                    arr[i] = arr[i + gap];
                    arr[i + gap] = temp;
                    swapped = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 4, 1, 56, 3, 5};
        System.out.println("Original array: " + Arrays.toString(arr));
        combSort(arr);
        System.out.println("Sorted array:   " + Arrays.toString(arr));
    }
}
