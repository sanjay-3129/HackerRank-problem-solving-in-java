//Questions - https://www.hackerrank.com/challenges/compare-the-triplets/problem
import java.util.*;
public class CompareTriplets{
	public static int[] Compare(int alice[], int bob[], int n){
		int Alice = 0, Bob = 0;
		int arr[] = new int[2];
		for(int k=0; k<n; k++){
			if(alice[k]>bob[k])
			Alice++;
			else if(bob[k]>alice[k])
			Bob++;
			else
			continue;
		}
		arr[0] = Alice;
		arr[1] = Bob;
		return arr;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = 3;
		int alice[] = new int[n];
		int bob[] = new int[n];
		for(int i=0; i<n && i<=100; i++){
			alice[i] = sc.nextInt();
		}
		for(int i=0; i<n && i<=100; i++){
			bob[i] = sc.nextInt();
		}
		int arr[] = Compare(alice,bob,n);
		for(int i=0; i<2; i++){
			System.out.print(arr[i]+" ");
		}
	}
}
