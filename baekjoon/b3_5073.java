package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b3_5073 {

    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            int[] arr = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .sorted()
                    .toArray();


            if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0) { break;}

            if(arr[0] + arr[1] <= arr[2]){
                System.out.println("Invalid");
            }
            else if(arr[0] == arr[1] && arr[1] ==arr[2] ) {
                System.out.println("Equilateral");
            }
            else if(arr[1] == arr[2] || arr[0] == arr[1] || arr[0] == arr[2]) {
                System.out.println("Isosceles");
            }
            else{
                System.out.println("Scalene");
            }
        }

    }
}
