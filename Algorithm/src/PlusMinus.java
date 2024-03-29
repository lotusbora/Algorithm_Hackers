import java.util.Scanner;

public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        final int size = arr.length;
        if( size < 0 || size > 100 ) return;

        int plustCnt = 0;
        int minusCnt = 0;
        int zeroCnt = 0;

        for(int value : arr) {
            if( value < -100 || value > 100 ) continue;
            if(value > 0) plustCnt++;
            else if(value < 0) minusCnt++;
            else zeroCnt++;
        }

        double negative = minusCnt / (double)size;
        double positive = plustCnt / (double)size;
        double zerotive = zeroCnt / (double)size;

        System.out.format("%.7f%n", positive);
        System.out.format("%.7f%n", negative);
        System.out.format("%.7f%n", zerotive);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}

