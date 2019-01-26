import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long k = s.length();
        int count = 0 ;
        int count1 = 0;
        
        for(int i = 0 ; i < k ; i++)
        {
            if(s.charAt(i) == 'a')
                count++;
        }
        long b = n / k ;
        long left = n % k;
        for(int i = 0 ; i < left ; i++)
        {
            if(s.charAt(i) == 'a')
                count1++;
        }
        long ans = b*count +count1;
        return ans;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
