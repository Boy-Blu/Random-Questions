package Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mouse_move {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] tokens = in.readLine().split(" ");
		int R = Integer.parseInt(tokens[0]) ;
		int C = Integer.parseInt(tokens[1]) ;
		int [] postion = {0,0};
		

		while (true) {
			tokens = in.readLine().split(" ");
			int r = Integer.parseInt(tokens[0]);
			int c = Integer.parseInt(tokens[1]);
			if (r==0&&c==0) {
				break;
			}
			postion[0] = Math.max(Math.min(R, postion[0]+r), 0);
			postion[1] = Math.max(Math.min(C, postion[1]+c), 0);
			System.out.println(postion[0] + " " + postion[1]);
		}
	}

}
