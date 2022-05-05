package Week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {
	public static void main(String[] args) {
		int Array[]= {3,2,11,4,6,7};
		int temp =0;
		List<Integer> list1 = new ArrayList<Integer>();
		for (int i: Array)
		{
			list1.add(i);
		}
		Collections.sort(list1);
		System.out.println("In ascending order: " + list1);
		temp = list1.get(list1.size() -2);
		System.out.println("2nd largent number is: " + temp);
		
	}

}
