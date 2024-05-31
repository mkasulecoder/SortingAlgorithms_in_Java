# Selection Sort Documentation
Selection sort works in a way that the first value in an array is assumed to be the minimum value, it (the first value) is then compared to the second value in the array, and in case it is larger than it, it is flipped/swapped with the second/other value in the list that is less than the first one so that the minimum is on the extreme left. The process continues until the whole array is sorted from left to right.

**Best Case Scenario**

Selection sort has a best-case scenario on small data that doesn't need sorting with a time complexity of O(n^2).

**Average Case Scenario**

Selection sort has an average case scenario on data that is jumbled together - neither ascending nor in descending order with a time complexity of O(n^2)

**Worst Case Scenario**

Selection sort has a worst-case scenario when data is in reverse/descending order and needs to be sorted in Ascending order with a time complexity of O(n^2)

**Key Take Away**

We have a time complexity of O(n^2) in all scenarios because of the two nested loops required in all scenarios to sort the data. it will also work best on small data sets only. (Simplilearn, 2023)