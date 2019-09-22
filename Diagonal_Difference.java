//Diagonal Difference
//Question - https://www.hackerrank.com/challenges/diagonal-difference/problem
import java.util.*;
import java.math.*;
public class Diagonal_Difference{
    public static void Difference(int arr[][], int n){
        int first = 0;
        int second = 0;
        for(int i=0; i<n; i++){
            first += arr[i][i];
        }
        int k = n-1;
        for(int i=0; i<n && k>=0; i++){
            second += arr[i][k];
            k--;
        }
        System.out.print(Math.abs(first - second));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        Difference(arr,n);
    }
}
