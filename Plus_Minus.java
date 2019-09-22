//plus minus
//Question - https://www.hackerrank.com/challenges/plus-minus/problem
import java.util.*;
class Plus_Minus{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        float positive = 0;
        float negative = 0; 
        float zero = 0;
        for(int i=0; i<n; i++){
            if(arr[i]<0){
                negative++;
            }
            else if(arr[i]>0){
                positive++;
            }
            else{
                zero++;
            }
        }
        float a = positive/n;
        float b = negative/n;
        float c = zero/n;
        System.out.printf("%.6f \n", a);
        System.out.printf("%.6f \n", b);
        System.out.printf("%.6f \n", c);
    }
}
