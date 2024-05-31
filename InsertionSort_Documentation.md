# Insertion Sort Documentation

If we take a closer look at the insertion sort code, we can notice that every iteration of while loop reduces one inversion. The while loop executes only if i > j and arr[i] < arr[j]. Therefore total number of while loop iterations (For all values of i) is same as number of inversions. Therefore overall time complexity of the insertion sort is O(n + f(n)) where f(n) is inversion count. If the inversion count is O(n), then the time complexity of insertion sort is O(n). In worst case, there can be n*(n-1)/2 inversions. The worst case occurs when the array is sorted in reverse order. So the worst case time complexity of insertion sort is O(n2).

**Key Take away**
* insertion sort = after comparing elements to the left
* shift elements to the right to make room to insert a value
* Quadratic time 0(n^2)
* small data set = decent
* large data set = BAD
* Less steps than Bubble Sort
* Best case is O(n) compared to Selection Sort 0(n^2)