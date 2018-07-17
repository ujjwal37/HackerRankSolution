import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        for(int i = 0; i < n; i++){
            String str = input.nextLine();

        
                         for(int j= 0; j < str.length();j++){
                             
                             if(j %2 == 0 || j==0){
                                 System.out.print(str.charAt(j));
                             }
                         }
           System.out.print(" ");
            for(int k= 1; k < str.length();k++){
                if(k%2-1==0){
                    System.out.print(str.charAt(k));
                }
            }
        System.out.println();
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}