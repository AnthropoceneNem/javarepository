package Basic_Structure_and_Syntax;

public class combsort {
    public static void combSort(int[] arr) {
        int n = arr.length;
        int gap = n;
        boolean swapped = true;

        while (gap != 1 || swapped) {
            gap = (gap * 10) / 13;
            if (gap < 1) gap = 1;

            swapped = false;
            for (int i = 0; i < n - gap; i++) {
                if (arr[i] > arr[i + gap]) {
                    // Swap elements
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
        System.out.println("Original array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        combSort(arr);

        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}