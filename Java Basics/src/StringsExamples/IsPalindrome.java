package StringsExamples;

public class IsPalindrome {
    public static boolean ispalindrome(String str){
        int n = str.length()-1;
        for (int i=0 ; i<=(n/2) ; i++){
            if (str.charAt(i) != str.charAt(n-i)){
                return false;
            }
        }

        return true;
    }
}
