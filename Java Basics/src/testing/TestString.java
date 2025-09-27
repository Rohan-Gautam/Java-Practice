package testing;

import java.util.Scanner;
import StringsExamples.*;

public class TestString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a string:");
        String inputStr = sc.nextLine();

        String menu = "Choose the operation to perform on the string:\n"
                + "0. Exit\n"
                + "1. Check if palindrome\n"
                + "2. Reverse the string\n"
                + "3. Convert to uppercase\n"
                + "4. Convert to lowercase";


        boolean validInput = false;
        while(!validInput){
            System.out.println();
            System.out.println(menu);
            int choice = sc.nextInt();
            sc.nextLine();  // consume new line after int input
            System.out.println();

            switch(choice){
                case 0:
                    System.out.println("Exiting the program");
                    validInput = true;
                    break;
                case 1:
                    System.out.println("Is palindrome? " + IsPalindrome.ispalindrome(inputStr));

                    break;
                case 2:
                    System.out.println("Reversed String: " + new StringBuilder(inputStr).reverse().toString());
                    break;
                case 3:
                    System.out.println("Uppercase: " + inputStr.toUpperCase());
                    break;
                case 4:
                    System.out.println("Lowercase: " + inputStr.toLowerCase());
                    break;
                default:
                    System.out.println("Invalid choice, please select from 0 to 4.");
                    System.out.println(menu);
                    break;
            }
        }

        sc.close();
    }
}
