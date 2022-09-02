package program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ArraySorting {

	public static void arraySort() {

		int temp;
		int a[] = { 2, 77, 50, 2, 22, 100 };

		System.out.println(Arrays.toString(a));
		System.out.println(a.length);
		
		  for (int i = 0; i < a.length-1; i++) {
			  System.out.print("i=="+i);
		  if (a[i] < a[i+1]) {
		  
		  temp = a[i]; a[i] = a[i+1]; a[i+1] = temp;
		  
		  i=-1;
		 
		  System.out.println(Arrays.toString(a));
		  
		  } } 
		 
		System.out.println(Arrays.toString(a));
		/*
		 * for (int i = 0; i < a.length; i++) {
		 * 
		 * for (int j = i + 1; j < a.length; j++) {
		 * 
		 * if (a[i] < a[j]) {
		 * 
		 * temp = a[i]; a[i] = a[j]; a[j] = temp;k++;
		 * 
		 * } System.out.print("i=="+i); System.out.print("j=="+j);
		 * System.out.println(Arrays.toString(a)); }
		 * 
		 * 
		 * }
		 */

		
		  for (int i = 0; i < a.length; i++) { System.out.println(a[i]); 
		  }
		
	}
	
	/*
	 * public static void arraySortAlpha() {
	 * 
	 * String temp; String a[] = { "s", "b", "d", "f", "o"}; for (int i = 0; i <
	 * a.length; i++) {
	 * 
	 * for (int j = i + 1; j < a.length; j++) { a[i].
	 * 
	 * 
	 * if (a[i] < a[j]) {
	 * 
	 * temp = a[i]; a[i] = a[j]; a[j] = temp;
	 * 
	 * } }
	 * 
	 * }
	 * 
	 * for (int i = 0; i < a.length; i++) {
	 * 
	 * System.out.println(a[i]);
	 * 
	 * }
	 */
	  
	 
	public static void duplicateWord(String sentence) {
		String[] split = sentence.split(" ");

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (String string : split) {

			if (map.containsKey(string)) {

				map.put(string, map.get(string) + 1);

			} else {
				map.put(string, 1);
			}
		}

		System.out.println(map);

		Set<Entry<String, Integer>> entrySet = map.entrySet();
		ArrayList<String> arrayList = new ArrayList<String>();
		for (Entry<String, Integer> entry : entrySet) {

			if (entry.getValue() > 1) {

				arrayList.add(entry.getKey());

			}

		}
		System.out.println(arrayList.toString());
		
		
	}	

	
	/*
	 * public static void maximumDifference(int a[])
	 * 
	 * { int k=0; int difference[a.length]; for (int i = 0; i < a.length; i++) {
	 * 
	 * difference[]=a[i]-a[i+1];
	 * 
	 * } int temp;
	 * 
	 * for (int i = 0; i < difference.length; i++) {
	 * 
	 * if (difference[i] > difference[i + 1])
	 * 
	 * { temp = difference[i]; difference[i] = difference[i + 1]; difference[i] =
	 * temp; i--; }
	 * 
	 * }
	 * 
	 * System.out.println(difference[0]);
	 * 
	 * 
	 * }
	 */
	
	public static void zero(int a[]) {

		int temp;
		
		for(int i=0;i<a.length-1;i++)
		{
			
				if(a[i]==0&&!(a[i+1]==0))
				{
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				i=-1;
				}		
				}

				/*
				 * for(int i=0;i<a.length;i++) { for (int j = i+1; j < a.length; j++) {
				 * if(a[i]==0&&!(a[j]==0)) { temp=a[i]; a[i]=a[j]; a[j]=temp; } }}
				 */
		
		
		System.out.printf(Arrays.toString(a));
	}
	
	
	
	public static void main(String[] args) {

//		arraySort();
		
		int k []= {0,0,1, 0, 2,0, 6, 0, 4};
		zero(k);
//		maximumDifference(k);
		
//		duplicateWord("My new hello world program prints hello and world and also prints welcome");
	}

}
