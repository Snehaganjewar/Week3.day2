package Week3.day2;

import java.util.Set;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week3";
		String [] split = text.split(" ");
		Set<String> Value = new LinkedHashSet<String>();
		for (String var:split)
		{
			Value.add(var);
		}
		System.out.println(Value);
		
	}

}
