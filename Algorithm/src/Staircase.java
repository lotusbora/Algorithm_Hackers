import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Staircase {
	 // Complete the staircase function below.
    static void staircase(int n) {
        if(n <= 0 || n > 100) return;
			
        for(int i = n; i > 0; i--) {
            String str = "";
            for(int j = 1; j <= n ; j++) {
                if(j >= i) str+="#";
                else str+=" ";
            }
            System.out.println(str);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
