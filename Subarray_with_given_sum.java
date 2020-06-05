/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while(t>0){
		    int n = scn.nextInt();
		    int sum = scn.nextInt();
		    int [] arr = new int[n];
		    for(int i = 0;i<n;i++){
		        arr[i] = scn.nextInt();
		    }
		    subarr(n,sum,arr);
		    t--;
		}
	}
	
	public static int subarr(int n,int sum,int[]arr){
	    
	    for(int i = 0;i<n;i++){
	        int temp = arr[i];
	        if(temp==sum){
	            int p = i+1;
	            System.out.println(p+" "+p);
	            return 0;
	        }else{
	            
	        
	        for(int j = i+1;j<n;j++){
	            temp = temp + arr[j];
	            if(temp==sum){
	                int pos1 = i+1;
	                int pos2 = j+1;
	                System.out.println(pos1+" "+pos2);
	                return 0;
	            }
	        }
	        }
	    }
	    System.out.println(-1);
	    return 0;
	    
	    
	    
	    
	    
	    
	    
	    
	}
}
