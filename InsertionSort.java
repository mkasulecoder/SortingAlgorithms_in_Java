/**
 * A program that sorts a given array in both ascending and descending order using the Insertion sort
 * @author Mark Kasule
 *
 * insertion sort = after comparing elements to the left
 * shift elements to the right to make room to insert a value
 * Quadratic time 0(n^2)
 * small data set = decent
 * large data set = BAD
 * Less steps than Bubble Sort
 * Best case is O(n) compared to Selection Sort 0(n^2)
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {3,4,6,2,7,1,99,5};
        // Original sort order
        for(int value: array) {
            System.out.print(value + " ");
        }
        System.out.println("");

        // Sort in Ascending order
        ascendingSort(array);
        for(int value: array) {
            System.out.print(value + " ");
        }
        System.out.println("");

        // Sort in descending order
        descendingSort(array);
        for(int value: array) {
            System.out.print(value + " ");
        }

    }

    // Sort data in ascending order
    private static void ascendingSort(int[] array) {
        // loop through array to get first element
        for(int i = 1; i < array.length; i++) {
            int temp = array[i]; // second element
            int j = i - 1; // get first element

            /* Move elements of arr[0..i-1], that are
            greater than key, to one position ahead
            of their current position */
            // This adds a constant time of O(1)
            while(j >= 0 && array[j] > temp){
                // move current j (second) to the next position (third)
                array[j +1] = array[j];
                j--; // decrement j index to prev position
            }

            // Assign second element to the third position
            array[j + 1] = temp;

        }
    }

    // Sort data in descending order
    private static void descendingSort(int[] array) {

        // loop through array to get first element
        for(int i = 1; i < array.length; i++) {
            int temp = array[i]; // second element
            int j = i - 1; // get first element

            /* Move elements of arr[0..i-1], that are
            greater than key, to one position ahead
            of their current position */
            while(j >= 0 && array[j] < temp){
                // move current j (second) to the next position (third)
                array[j +1] = array[j];
                j--; // decrement j index to prev position
            }

            // Assign second element to the third position
            array[j + 1] = temp;

        }
    }
}
