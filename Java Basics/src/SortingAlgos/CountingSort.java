package SortingAlgos;

public class CountingSort {
    public static void countingSort(int[] nums){
        int largest = Integer.MIN_VALUE;
        for (int j : nums) {
            largest = Math.max(largest, j);
        }

        int[] count = new int[largest+1];

        for (int num : nums) {
            count[num]++;
        }

        int start=0;
        for(int k=0 ; k<largest+1 ; k++){
            while(count[k] >0){
                nums[start] = k;
                start++;
                count[k]--;
            }
        }
    }
}
