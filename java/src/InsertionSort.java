public class InsertionSort {
    public static void main(String[] args) {
        int[] unsortedArray = {5, 7, 9, 8, 9, 4, 6, 2, 1, 3};

        System.out.println("Unsorted Array:");
        for (int u : unsortedArray) {
            System.out.print(u + " ");
        }
        System.out.println();

        for (int j = 1; j < unsortedArray.length; j++) {
            int key = unsortedArray[j];
            int i = j - 1;
            while (i > -1 && unsortedArray[i] > key) {
                unsortedArray[i + 1] = unsortedArray[i];
                i--;
            }
            unsortedArray[i + 1] = key;
        }

        System.out.println("Sorted Array: ");
        for (int s : unsortedArray) {
            System.out.print(s + " ");
        }
    }

}
