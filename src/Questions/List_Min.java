package Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class List_Min {

	public static int[] mergesort(int [] list) {
		if(list.length<=1) {
			return list;
		}

		int[] first = mergesort(Arrays.copyOfRange(list, 0, list.length/2));
		int[] Second = mergesort(Arrays.copyOfRange(list, list.length/2, list.length));


		int[] retval= merge(first, Second);
		return retval;



	}

	public static int[] merge(int [] list1, int [] list2) {
		int[] retval = new int [list1.length+list2.length];
		int lst1ptr = 0, lst2ptr =0, lstptr =0;

		while(lstptr<retval.length && lst2ptr< list2.length && lst1ptr<list1.length) {
			if (list2[lst2ptr]<list1[lst1ptr]) {
				retval[lstptr]= list2[lst2ptr];
				lst2ptr++;
			}else {
				retval[lstptr]= list1[lst1ptr];
				lst1ptr++;
			}
			lstptr++;
		}
		while(lstptr<retval.length && lst1ptr<list1.length) {

			retval[lstptr]= list1[lst1ptr];
			lst1ptr++;

			lstptr++;
		}
		while(lstptr<retval.length && lst2ptr< list2.length) {

			retval[lstptr]= list2[lst2ptr];
			lst2ptr++;

			lstptr++;
		}
		return retval;
	}


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String amount = in.readLine();
		int N = Integer.parseInt(amount);
		int [] list = new int [N];
		for(int i =0; i<N; i++) {
			amount = in.readLine();
			int n = Integer.parseInt(amount);
			list[i] = n; 
		}

		int[] thing = mergesort(list);

		for (int i = 0; i < thing.length; i++) {
			System.out.println(thing[i]);
		}

	}

}
