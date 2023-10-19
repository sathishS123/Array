package org.array;

import java.util.ArrayList;
import java.util.List;

public class Q10 {
public static void main(String[] args) {
	List<Integer> l=new ArrayList<>();
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(40);
	l.add(50);
	l.add(60);
	l.add(70);
	l.add(80);
	System.out.println(l);
	List<Integer> l2=new ArrayList<>();
	l2.add(100);
	l2.add(200);
	l2.add(300);
	l2.add(400);
	l2.add(500);
	l2.add(600);
	l2.add(700);
	l2.add(8000);
	System.out.println(l2);
	
	l2.retainAll(l);
	System.out.println(l2);
}
}
