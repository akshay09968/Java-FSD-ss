package com.files;

import java.io.*;
import java.util.Scanner;

public class FileReading {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileInputStream  fin = new FileInputStream("/home/akshay/Desktop/file_demo");
		int ch = fin.read();
		//System.out.println(ch);
		while(ch!=-1) {
			System.out.print((char)ch);
			ch= fin.read();
		}
		fin.close();
	}

}
