//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> find = new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            
            find.put(name,phone);
            // Write code here
        }
        while(in.hasNext()){
            String s = in.next();
            if(find.containsKey(s)){
                System.out.println(s + "=" + find.get(s));
            }else{
                System.out.println("Not found");
            }
            

            // Write code here
        }
        in.close();
    }
}