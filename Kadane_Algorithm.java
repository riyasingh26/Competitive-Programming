package demo;
import java.util.Scanner;
import java.lang.*;
public class kadane_algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t>0) {
        	int n = scn.nextInt();
        	int [] arr = new int[n];
        	for(int i = 0;i<n;i++) {
        		arr[i] = scn.nextInt();
        	}
        	System.out.println(kadane(n,arr));
        	t--;
        }
	}
	
	public static int kadane(int n, int[]arr) {
		int max = arr[0];
		int current_sum = arr[0];
		for(int i = 1; i < n; i++){
		current_sum = Math.max(arr[i], current_sum+arr[i]);
		max = Math.max(max, current_sum);
		}
		return max;
	}

}
