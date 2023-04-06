public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{123, 432, 1, 7, 23, 5, 43};
        BublSort bublSort = new BublSort();
        bublSort.bublSort(numbers);
        System.out.println("Sorted array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(numbers);
        System.out.println("Sorted array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}