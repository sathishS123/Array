package org.array;

import java.util.ArrayList;
import java.util.List;

public class Q8 {
public static void main(String[] args) {
	List<Integer> l=new ArrayList<>();
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(90);
	l.add(10);
	l.add(10);
	l.add(40);
	l.add(50);
	
	System.out.println(l);
	l.add(8,70 );
	System.out.println(l);
}
}
