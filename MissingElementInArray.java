package Week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInArray {
public static void main(String[] args) {
	int Array[]= {1,2,3,4,7,6,8};
	List<Integer> list1 = new ArrayList<Integer>();
	for (int i:Array)
	{
		list1.add(i);
	}
	System.out.println("Array : " + list1);
	Collections.sort(list1);
	System.out.println("Sorted Array: " + list1);
	int i=1;
	for(Integer integer:list1)
	{
		if(integer !=i)
		{
		System.out.println("Mising Element in the Array is: " + i);
		break;
		}
		i++;
	}
	
}
}
