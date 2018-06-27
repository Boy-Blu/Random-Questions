package Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AplusB_HARD {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String amount = in.readLine();
		int N = Integer.parseInt(amount);

		for (int i = 0; i < N; i++) {
			String[] tokens = in.readLine().split(" ");
			String one = tokens[0];
			String two = tokens[1];
			String A,B;
			if (one.startsWith("-")){
				A=one.substring(1);
			}else{
				A=one;
			}
			if (two.startsWith("-")){
				B=two.substring(1);
			}else{
				B=two;
			}
			String sum = ""; //Sum
			String sum2 = "";//difference
			int Carry = 0;
			int ptr = 0;
			for (int j = 0 ;j< Math.min(A.length(), B.length());j++){
				int num1 = Integer.parseInt(A.charAt(A.length()-j)+"");
				int num2 = Integer.parseInt(B.charAt(B.length()-j)+"");
				
				
				
				
				ptr = j;
			}
			
		}



	}

}
