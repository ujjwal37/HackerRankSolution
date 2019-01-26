import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the acmTeam function below.
    static int[] acmTeam(String[] topic) {
        int n = topic.length;
        int m = topic[0].length();
        int count = 0 ;
        int max = 0 ;
        int team = 0;
        for(int i = 0; i < n ; i++)
        {
            for(int  j = i+1 ; j < n ; j++)
            {
                for(int k = 0 ; k < m ; k++)
                {
                   if(topic[i].charAt(k) == '1' || topic[j].charAt(k) == '1')
                   {
                       count++;
                   }
                    if( count > max)
                    {
                        max = count;
                        team = 1;
                    }else
                        if(count == max)
                        {
                            team++;
                        }
                }
                count = 0;
                    
                }
            }
        int []answer = new int[]{max , team};
        return answer;
        }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        String[] topic = new String[n];

        for (int i = 0; i < n; i++) {
            String topicItem = scanner.nextLine();
            topic[i] = topicItem;
        }

        int[] result = acmTeam(topic);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
