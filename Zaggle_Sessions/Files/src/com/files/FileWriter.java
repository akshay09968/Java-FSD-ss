package com.files;

import java.io.*;
import java.util.Scanner;

public class FileWriter {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("/home/akshay/Desktop/file_demo",true);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the data: ");
		String str = sc.nextLine();
			
		str = str + "\n";
		
		fw.write(str);
		
		System.out.println("File is created...");
		
		
			
	}

}
