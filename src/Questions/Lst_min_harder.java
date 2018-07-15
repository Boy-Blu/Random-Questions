package Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Lst_min_harder {

	public static String[] mergesort(String [] list) {
		if(list.length<=1) {
			return list;
		}

		String[] first = mergesort(Arrays.copyOfRange(list, 0, list.length/2));
		String[] Second = mergesort(Arrays.copyOfRange(list, list.length/2, list.length));


		String[] retval= merge(first, Second);
		return retval;



	}

	public static String[] merge(String[] list1, String [] list2) {
		String[] retval = new String [list1.length+list2.length];
		int lst1ptr = 0, lst2ptr =0, lstptr =0;

		while(lstptr<retval.length && lst2ptr< list2.length && lst1ptr<list1.length) {
			if (list2[lst2ptr].compareTo(list1[lst1ptr])==-1) {
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
		String [] list = new String [N];
		for(int i =0; i<N; i++) {
			list[i] = in.readLine();
		}

		String[] thing = mergesort(list);

		for (int i = 0; i < thing.length; i++) {
			System.out.println(thing[i]);
		}

	}

}
