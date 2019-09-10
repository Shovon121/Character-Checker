package charcheck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

    static String s = "aaerewreta";
    static char[] arr = new char[s.length()];

    static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter input characters and press enter: ");
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] += s.charAt(i + 1);

            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            }
        }
        br.close();
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + String.valueOf(arr));
        System.out.println(count);

    }

}
