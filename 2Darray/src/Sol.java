import java.io.*;
import java.util.*;

public class Sol {
    public static void main(String[] args)  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[6][6];
        
        for(int i = 0; i < 6; i++) {
            String[] input = br.readLine().split(" ");
            for(int j = 0; j < 6; j++) {
                arr[i][j] = Integer.parseInt(input[j]);
            }
        }

        int max = Integer.MIN_VALUE;

        for(int i = 0; i <= 3; i++) {
            for(int j = 0; j <= 3; j++) {
                int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2]
                        + arr[i+1][j+1]
                        + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]; 

                if(sum > max) max = sum;
            }
        }

        System.out.println(max);
    }
}
