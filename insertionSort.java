import java.util.*;

class InsertionSort {
    public final static void main(String args[]) {
        int[] arr1 = {10, 14, 28, 11, 7, 16, 30, 50, 25, 18};
        int[] arr2 = {7, 10, 11, 14, 16, 18, 25, 28, 30, 50, 77, 32, 47, 2, 88, 42, 7};

        List<Integer> sortedArray = new ArrayList<Integer>();

        // we mark the first number as already sorted
        sortedArray.add(arr1[0]);

        int i = 0;
        for (int number : arr1) {
            i++;
//            //get next number from unsorted array and compares to the last number of sorted array
            if (arr1[i] > sortedArray.get(sortedArray.size() - 1)){
                sortedArray.add(arr1[i]);
            }else{

                for(int j = 0; j < sortedArray.size(); j++)
                    //if next number is not sorted go back and find placement for placement
                    if(arr1[i] < sortedArray.get(j)){
                        //add number to specified index
                        sortedArray.add(j, arr1[i]);
                        break;
                    }
                }
            }

            //error handling
            if(i == arr1.length - 1){
                break;
            }
        }
        System.out.println(sortedArray);
    }
}
