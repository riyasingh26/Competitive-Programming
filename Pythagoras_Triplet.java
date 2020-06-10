/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner scn = new Scanner(System.in);
		 
		int t = scn.nextInt();
		while(t>0){
		    int n = scn.nextInt();
		    int [] arr = new int[n];
		    for(int i = 0;i<n;i++){
		        arr[i] = scn.nextInt();
		    }
		    System.out.println(triplet(n,arr));
		    t--;
		}	
	}
	
	public static int triplet(int n, int []arr) {
		
// 		for(int i = 0;i<n;i++) {
// 			arr[i] = arr[i] * arr[i];
// 		}
		
		// sorting the array
		
		for(int i = 0;i<n-1;i++) {
			for(int j = 0;j<n-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp; 
				}
			}
		}
		
		int count = 0;
		for(int i = n-1;i>=2;i--) {
			int l = 0;
			int r = i-1;
			
			while(l<r) {
				if(arr[l]+arr[r]==arr[i]){
			        count++;
				}else if(arr[l]+arr[r]<arr[i]) {
					l++;
				}else{
					r--;
			    }
		    }
		}
		   if(count==0) {
			   return -1;
		   }else {
			   return count;
		   }
           		
	}
}
