import java.util.*;

class InsertionSort {
    public final static void main(String args[]) {
        int[] arr1 = {10, 14, 28, 11, 7, 16, 30, 50, 25, 18, 2, 1, 77, 88, 90, 54, 66, 77, 8, 9, 22, 26, -1};
        //instantiate mutable list
        List<Integer> sortedArray = new ArrayList<Integer>();
        // we mark the first number as already sorted
        sortedArray.add(arr1[0]);

        for (int i = 0; i < arr1.length; i++) {
           //get next number from unsorted array and compares to the last number of sorted array
            if (arr1[i] > sortedArray.get(sortedArray.size() - 1)) {
                sortedArray.add(arr1[i]);
            } else {
                for (int j = 0; j < sortedArray.size(); j++) {
                    //if next number is not sorted go back and find placement for placement
                    if (arr1[i] < sortedArray.get(j)) {
                        //add number to specified index
                        sortedArray.add(j, arr1[i]);
                        break;
                    }
                }
            }

            //error handling
            if (i == arr1.length - 1) {
                break;
            }
            System.out.println(sortedArray);
        }
    }
}