import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        Scanner input = new Scanner(System.in);
        int que = input.nextInt();
        int ans;
        int value;
        int n;
        for(int i = 0; i < que; i++)
        {
            ans = input.nextInt();
            if(ans == 1)
            {    
                value = input.nextInt();
                s1.push(value);
            }
            if(ans == 2)
            {
                if(s2.isEmpty()){
                    while(!s1.isEmpty())
                    {
                        s2.push(s1.pop());
                    }
               
                }
                s2.pop();
            }
            if(ans == 3)
            {  if(s2.isEmpty()){
                while(!s1.isEmpty())
                {
                    s2.push(s1.pop());
                }
               
            }
            System.out.println(s2.peek());
            }
        }
    }
}

