//Question - https://www.hackerrank.com/challenges/the-birthday-bar/problem
//birthday chocolate bar
import java.util.Scanner;
public class Chocolate_bar{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		int d = sc.nextInt();
		int m = sc.nextInt();
		int ways = 0;
		for(int i=0; i<=n-m; i++){
			int count = 0;
			for(int j=i; j<i+m; j++){
				count = count + arr[j];
			}
			if(count==d){
				ways++;
			}
		}
		System.out.println(ways);
	}
}
