package demo;
import java.util.Scanner;
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
		int meh = 0;
		int msf = 0;
		for(int i = 0;i<n;i++) {
			meh = meh + arr[i];
			if(meh<0) {
				meh = 0;
			}
			if(msf<meh) {
				msf = meh;
			}
		}
		return msf;
	}

}
