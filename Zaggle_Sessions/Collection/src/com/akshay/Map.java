package com.akshay;

import java.util.*;
public class Map {

	public static void main(String[] args) {
		HashMap<Integer,String> stdinfo = new HashMap<Integer, String>();
		
		stdinfo.put(01,"Aksh Desh");
		stdinfo.put(02,"Ak Desh");
		stdinfo.put(03,"sh Desh");
		stdinfo.put(04,"Ah Desh");
		stdinfo.put(05,"ks Desh");
		
		System.out.println();
		for(HashMap.Entry std: stdinfo.entrySet()) {
			System.out.println(std);
		}
	
		System.out.println("Enter the roll no: ");
		Scanner sc = new Scanner(System.in);
		int rno = sc.nextInt();
		
		if(stdinfo.containsKey(rno)) {
			System.out.println("Key exists: " + stdinfo.get(rno));
		}else {
			System.out.println("Key doesnot exist");
		}
	}

}
