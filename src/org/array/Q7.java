package org.array;

import java.util.ArrayList;
import java.util.List;

public class Q7 {
public static void main(String[] args) {
	List<Integer> l=new ArrayList<>();
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(90);
	l.add(10);
	l.add(10);
	l.add(40);
	
	System.out.println(l);
	l.remove(10);
	
	System.out.println(l);
}
}
