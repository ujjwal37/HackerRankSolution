import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int sum = A.length()+B.length();
        System.out.println(sum);
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        System.out.println( firstletter(A)+" "+firstletter(B));
                         

        /* Enter your code here. Print output to STDOUT. */
        
    }
    private static String firstletter(String str){
        return str.substring(0,1).toUpperCase()+str.substring(1);
    }
}

