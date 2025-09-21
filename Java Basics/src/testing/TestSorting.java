package testing;

import SortingAlgos.*;
import java.util.Scanner;
import java.util.Arrays;


public class TestSorting {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("*---------------------------------------------------------------------------------------------------------------------------------*");
        System.out.println();

        System.out.println("Please enter the number of elements of the input array to be sorted: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Please enter the elements of the input array to be sorted (space separated): ");
        for(int i=0 ; i<n ; i++){
            nums[i] = sc.nextInt();
        }

        String selectionText = "Choose the Sorting Algorithm to implement: \n  --> Case 1 (1): Selection Sort \n  --> Case 2 (2): Insertion Sort \n  --> Case 3 (3): Inbuilt Sort \n";
        System.out.println(selectionText);

        int selection = sc.nextInt();

        boolean goodinput = true;
        while(goodinput)
            switch (selection){
                case 1:
                    SelectionSort.selectionSort(nums);
                    goodinput = false;
                    break;

                case 2:
                    InsertionSort.insertionSort(nums);
                    goodinput = false;
                    break;

                case 3:
                    Arrays.sort(nums);
                    goodinput = false;
                    break;

                default:
                    System.out.println("Please provide cases from the given menu like 1 or 2 or 3 or 4. ");
                    System.out.println(selectionText);
                    selection = sc.nextInt();
                    break;
            }

        //print the sorted array
        System.out.print("Sorted Array: [");
        for(int i=0 ; i<nums.length-1 ; i++){
            System.out.print(nums[i] + ", ");
        }
        //print last element of sorted array
        System.out.println(nums[nums.length-1] + "]");

        System.out.println();

        System.out.println(Arrays.toString(nums));

        System.out.print("*---------------------------------------------------------------------------------------------------------------------------------*");
        sc.close();
    }
}
