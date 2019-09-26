//https://www.hackerrank.com/challenges/grading/problem
import java.util.*;
public class Grading{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<n; i++){
			int temp = arr[i]; 
			int rem = temp%5; 
			int dif =  temp - rem; 
			int new_num = dif + 5; 
			int new_add = new_num - temp;
			if(temp>=38){
				if(new_add < 3 && new_add>0){
					arr[i] = new_num;
				}
			}
		}
		for(int i=0; i<n; i++){
			System.out.println(arr[i]);
		}
	}
}
