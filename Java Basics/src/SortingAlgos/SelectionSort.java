package SortingAlgos;

public class SelectionSort {
    public static int[] selectionSort(int[] nums){

        for( int i=0 ; i<nums.length ; i++){
            for(int j=i+1 ; j<nums.length ; j++){
                if( Math.min(nums[i],nums[j]) == nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        return nums;
    }
}
