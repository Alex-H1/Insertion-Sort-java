import java.util.*;

class InsertionSort {
    public final static void main(String args[]) {
        int[] arr = {10, 14, 28, 11, 7, 16, 30, 50, 25, 18};
        int[] arr2 = {7, 10, 11, 14, 16, 18, 25, 28, 30, 50};

        List<Integer> sortedArray = new ArrayList<Integer>();

        // we mark the first number as already sorted
        sortedArray.add(arr[0]);

        int i = 0;
        for (int number : arr) {
            i++;
//            //get next number from unsorted array and compares to the last number of sorted array
            if (arr[i] > sortedArray.get(sortedArray.size() - 1)) {
                sortedArray.add(arr[i]);
            }else{
                for(int j = sortedArray.size() - 1; j >= 0; j--){
                    System.out.println(arr[i]);
                    if(sortedArray.get(j) < arr[i] == false){
//                        System.out.println(arr[i]);
                        sortedArray.add(j, arr[i]);
                        break;
                    }

                }
            }
            //error handling
            if(i == arr.length - 1){
                break;
            }
        }
        System.out.println(sortedArray);
    }
}
