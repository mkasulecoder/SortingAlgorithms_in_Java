/**
 * A program that sorts a given array in both ascending and descending order using the Insertion sort
 * @author Mark Kasule
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {3,4,6,2,7,1,99,5};
        // Original sort order
        for(int value: array) {
            System.out.print(value + " ");
        }
        // Sort in Ascending order
        ascending(array);
        for(int value: array) {
            System.out.print(value + " ");
        }
        // Sort in descending order
        descending(array);
        for(int value: array) {
            System.out.print(value + " ");
        }

    }

    private static void descending(int[] array) {
    }

    private static void ascending(int[] array) {
    }
}
