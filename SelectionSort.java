/**
 * A Selection sort Program/algorithm that focuses on sorting a list of items
 * in both ascending and descending order. The larger the dataset, the inefficient the algo works
 * Time complexity Best, Average and Worst case Scenario = O(n^2)
 * @author Mark Kasule
 */
public class SelectionSort {

    public static void main(String[] args) {

        int[] array = {3,4,6,2,7,1,99,5};

        // Average Case Scenario - sort jumbled data in reverse order
        descendingSort(array);

        // Worst Case Scenario - sorting reversed data
        ascendingSort(array);

        // Best case Scenario - already sorted data
        ascendingSort(array);

        for(int value : array) {
            System.out.print(value + "\t");
        }
    }

    /**
     * Sort in ascending order
     * @param array
     */
    private static void ascendingSort(int[] array) {
        // Start with first element at index 0;
        for(int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            // Starts with next element
            for (int j = i +1; j < array.length; j++){
                if(array[minIndex] > array[j]){
                    // re-assign first index to second with smaller value
                    minIndex = j;
                }
            }
            // flip the larger values to be held by temp value
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    /**
     * Sort in descending order
     * @param array
     */
    private static void descendingSort(int[] array) {
        for(int i = 0; i < array.length -1; i++){
            int minIndex = i;
            for(int j = i + 1; j < array.length; j++){
                // flip index
                if(array[minIndex] < array[j]){
                    minIndex = j;
                }
            }
            // flip the smaller values to be held by temp value
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
