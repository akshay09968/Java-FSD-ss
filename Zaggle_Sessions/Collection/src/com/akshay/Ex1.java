package com.akshay;
import java.util.*;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strlist = new ArrayList<String>();
		
		strlist.add("Aksh");
		strlist.add("itachi");
		strlist.add("sasuke");
		strlist.add("naruto");
		strlist.add("madara");
		System.out.println(strlist);
		
		for(String str:strlist) {
			System.out.println(str);
		}
		
		List<Integer> intlist = new ArrayList<Integer>();
		for(int i=1;i<=10;i++) {
			intlist.add(i);
		}
		
		for(int a : intlist) {
			System.out.print(a+" ");
		}
		
	}

}
