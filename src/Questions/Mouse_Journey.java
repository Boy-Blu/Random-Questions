package Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mouse_Journey {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Solved Using Pascal Triangle
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] tokens = in.readLine().split(" ");
		int R = Integer.parseInt(tokens[0]) ;
		int C = Integer.parseInt(tokens[1]) ;
		int[][] Maze = new int [R][C];
		Maze[0][0]=1;
		String amount = in.readLine();
		int K = Integer.parseInt(amount);

		for(int i =0; i<K; i++) {
			tokens = in.readLine().split(" ");
			int r = Integer.parseInt(tokens[0])-1;
			int c = Integer.parseInt(tokens[1])-1;
			Maze[r][c] = -1;
		}
		for (int i = 0; i < Maze.length; i++) {
			for (int j = 0; j < Maze[i].length; j++) {
				if(Maze[i][j]!=-1) {
					//Not Cage
					if (i!=0&&j!=0) {
						Maze[i][j]=0;
					}

					if(i-1>=0) {
						if(Maze[i-1][j]!=-1) {
							Maze[i][j]+= Maze[i-1][j];
						}
					}
					if(j-1>=0) {
						if(Maze[i][j-1]!=-1) {
							Maze[i][j]+= Maze[i][j-1];
						}
					}	
				}
			}
		}
		System.out.println(Maze[R-1][C-1]);
	}

}
