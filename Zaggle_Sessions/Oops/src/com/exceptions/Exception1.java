package com.exceptions;

import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int div = x/y;																							
			
			System.out.println("Division is: " + div);
		}catch(Exception e) {
			System.out.println(e);
			System.out.println("Arithmatic Exception ");
		}
	}
}
