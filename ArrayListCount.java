package Week3.day2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCount {
public static void main(String[] args) {
	List<Integer> list = new ArrayList<Integer>();
	int count=0; int i;
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(1);
	list.add(4);
	list.add(5);
	list.add(1);
	list.add(6);
	
	int size=list.size();
	System.out.println(size);
	{
	for(i=0; i<size;i++) 
	{
		if(i==1)
			count++;
	}
	System.out.println(count);
	}
}
}
