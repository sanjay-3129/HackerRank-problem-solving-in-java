//Birthday Cake candles
import java.util.*;
public class Birthday_Cake_Candles{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int count = 0;
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int tall = arr[n-1];
		for(int i=0; i<n; i++){
			if(arr[i] == tall){
				count++;
			}
		}
		System.out.println(count);
	}
}
