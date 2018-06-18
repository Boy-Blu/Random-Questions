package Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Fibonacci {
	static Hashtable<Long, Long> numbers = new Hashtable<Long, Long>();
	public static long solve(long n){
		try{
			long sol = numbers.get(n);
			return sol;
		}catch(java.lang.NullPointerException e){}


		//Dijkstrsa method
		if(n==0){
			return 0;
		}else if(n==1){
			return 1;
		}else{
			long ans = 0;
			if(n%2==0){
				//Case of even
				long val = n/2;
				ans = (2*solve(val-1)+solve(val))*solve(val);

			}else{
				long val = (n+1)/2;
				ans = solve(val-1)*solve(val-1) + solve(val)*solve(val);
			}
			ans %= 1000000007;
			numbers.put(n,ans);
			return ans;
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String amount = in.readLine();
		long N = Long.parseLong(amount);
		long sol = solve(N) % 1000000007;
		System.out.println(sol);


	}

}
