import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
        Difference(int[] elements){
              this.elements = elements;
          }
     public void computeDifference(){
         int max = 0;
         int abs = 0;
         for(int i = 0 ; i < elements.length; i++)
         {} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
             for(int j = 0 ;  j< elements.length ; j++)
             {
                 abs  = Math.abs(elements[j]-elements[i]);
                 if(abs > max)
                 {
                     max = abs;
                 }
                 
             }
             maximumDifference = max;
         }
         }

     