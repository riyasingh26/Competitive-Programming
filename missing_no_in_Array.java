/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
	
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t>0) {
        	int n = scn.nextInt();
        	int [] arr = new int [n-1];
        	for(int i = 0;i<n-1;i++) {
        		arr[i] = scn.nextInt();
        	}
        	System.out.println(find_missing_number(n,arr));
        	t--;
        }
	}
	
	public static int find_missing_number(int n, int[] arr) {
//		int temp = arr[0];
//		for(int i = 1;i<n;i++) {
//			if(arr[i]==temp+1) {
//				temp = arr[i];
//			}else {
//				temp = temp+1;
//				break;
//			}
//		}
//		
//		return temp;
		int sum = (n*(n+1))/2;
		int arr_sum = 0;
		for(int i = 0;i<n-1;i++) {
			arr_sum = arr_sum + arr[i];
		}
		int ans = sum-arr_sum;
		return ans;
	}
}
