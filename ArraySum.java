//Questions - https://www.hackerrank.com/challenges/simple-array-sum/problem
import java.util.Scanner;
public class ArraySum {
    static int simpleArraySum(int[] ar) {
        int result = 0;
        for(int i=0; i<ar.length; i++){
            result = result + ar[i];
        }
        return result;
    }

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int result = simpleArraySum(arr);
        System.out.println(result);
    }
}
