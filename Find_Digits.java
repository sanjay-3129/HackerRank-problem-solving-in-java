//Find_Digits
// Questions - https://www.hackerrank.com/challenges/find-digits/problem
import java.util.Scanner;
public class Find_Digits{
	public static int[] findDigits(int arr[], int n){
		int res[] = new int[n];
		int rem = 0;
		for(int i=0; i<n; i++){
			int num = arr[i];
			int temp = arr[i];
			res[i] = 0;
			while(temp!=0){
				rem = temp%10;
				if(rem>0 && num%rem==0){
					res[i]++;
				}
				temp = temp/10;
			}
		}
		return res;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		int result[] = findDigits(arr,n);
		for(int k=0; k<n; k++){
			System.out.println(result[k]);
		}
	}
}
