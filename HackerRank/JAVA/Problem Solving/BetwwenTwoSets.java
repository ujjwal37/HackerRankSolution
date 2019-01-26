import java.util.*;
public class Solution {
    static int lcm(int[] b, int n) {
          int res = 1, i;
          for (i = 0; i < n; i++) 
            res = res*b[i]/gcd(res, b[i]);
          return res;
    }
    static int gcd(int a, int b){
        if (a == 0)
            return b;
        return gcd(b%a, a);
    }
    static int findGCD(int b[], int n){
        int result = b[0];
        for (int i=1; i<n; i++)
            result = gcd(b[i], result); 
        return result;
    }
    static int getTotalX(int[] a, int[] b) {
       int m,n,count=0;
        m=lcm(a,a.length);
        n=findGCD(b,b.length);
        for(int i = m, j =2; i<=n; i=m*j,j++)
            if(n%i==0)
                count++;
        return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = in.nextInt();
        int[] b = new int[m];
        for(int j = 0; j < m; j++)
            b[j] = in.nextInt();
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}