package rubbish;

import java.util.*;

public class example {

    public static void main(String[] args) {
        Integer[] nums = {2323,4523,345435,434532,243,542,542,54542,43};
        Arrays.sort(nums, Collections.reverseOrder());
        System.out.println(Arrays.toString(nums));
    }
}
