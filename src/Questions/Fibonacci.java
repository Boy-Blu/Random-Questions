package Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;


public class Fibonacci {
	static Hashtable<BigInteger, Long> numbers = new Hashtable<BigInteger, Long>();
	public static long solve(BigInteger n){
		try{
			long sol = numbers.get(n);
			return sol;
		}catch(java.lang.NullPointerException e){}


		//Dijkstrsa method
		if(n.compareTo(BigInteger.ZERO)==0){
			return 0;
		}else if(n.compareTo(BigInteger.ONE)==0){
			return 1;
		}else{
			long ans = 0;
			if(n.remainder(new BigInteger("2")).compareTo(BigInteger.ZERO)==0){
				//Case of even
				BigInteger val = n.divide(new BigInteger("2"));
				
				
				
				
				ans = (2*solve(val.subtract(BigInteger.ONE))+solve(val))*solve(val);

			}else{
				BigInteger val = (n.add(BigInteger.ONE)).divide(new BigInteger("2"));
				ans = solve(val.subtract(BigInteger.ONE))*solve(val.subtract(BigInteger.ONE)) + solve(val)*solve(val);
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
		BigInteger N = new BigInteger(amount,10);
		long sol = solve(N) % 1000000007;
		System.out.println(sol);


	}

}
