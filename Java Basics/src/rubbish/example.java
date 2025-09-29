package rubbish;

import java.util.*;

public class example {

    public static void main(String[] args) {


        int[] arr = {1, 4, 5634, 47, 7447, 7, 547, 4647, 47, 6, 45, 746, 4, 35, 7};
        System.out.println(Arrays.toString(arr));

        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;

            while (prev >= 0 && curr < arr[prev]) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev+1]= curr;
        }
        System.out.println(Arrays.toString(arr));
    }
}
