package com.files;

import java.io.*;
import java.util.Scanner;

class FilesIO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		FileOutputStream fout = new FileOutputStream("/home/akshay/Desktop/file_demo");
		
		System.out.println("Enter data: ");
		String str = sc.nextLine();
		
		byte arr[] = str.getBytes(); //converts string into bits and bytes
		fout.write(arr); //writes data into the file
		
		System.out.println("File created");
		fout.close();
		sc.close();
	}

}
