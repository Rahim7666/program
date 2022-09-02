package program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateRemoval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = { 10, 1, 5, 10, 22, 10, 0, 9 ,5};
		int b[] = { 10, 1, 5, 10, 10, 0, 9 ,5};

		List<Integer> number = new ArrayList<Integer>(Arrays.asList(10, 1, 5, 10, 22, 10, 0, 9 ,5));
		List<Integer> number2 = new ArrayList<Integer>(Arrays.asList(10, 1, 5, 10, 10, 0, 9 ,5));
		number.addAll(number2);
		
		System.out.println(number);
	 
		List<Integer> mergeWithoutDuplicate = new ArrayList<Integer>(new LinkedHashSet<Integer>(number));
		System.out.println(mergeWithoutDuplicate);
		

	}
}
