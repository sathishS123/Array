package org.array;

import java.util.ArrayList;
import java.util.List;

public class Q9 {
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
	l.add(10);
	
	System.out.println(l);
	
    l.set(7, 90);
    System.out.println(l);
}
}
