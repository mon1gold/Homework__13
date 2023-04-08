public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{123, 432, 1, 7, 23, 5, 43};
        int[] array = new int[]{99,123,1,324,2,54,6};
        BubbleSort sort = new BubbleSort();
        sort.sort(numbers);
        System.out.println(" Bubble sorted array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(array);
        System.out.println("Insertion sorted array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}