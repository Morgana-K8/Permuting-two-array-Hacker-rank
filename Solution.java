import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Q = input.nextInt();
        
        StringBuilder output = new StringBuilder("");

        queries:
        for(int q = 0; q < Q; q++)
        {
            int n = input.nextInt();
            int k = input.nextInt();
            
            int[] A = new int[n];
            int[] B= new int[n];
            for(int i = 0; i < n; i++)
                A[i] = input.nextInt();
            for(int i = 0; i < n; i++)
                B[i] = input.nextInt();
            
            Arrays.sort(A);
            Arrays.sort(B);    
          
            for(int i = 0; i < n; i++)
            {
                
                if(A[i]+B[B.length-1-i] < k) 
                {
                    output.append("NO\n");
                    continue queries;
                }
            }
            
           
            output.append("YES\n");
            
        }
        
        System.out.println(output);
    }
}

/*  
2
3
10
2 1 3
7 8 9
4 5
1 2 2 1
3 3 3 4
YES
NO
*/