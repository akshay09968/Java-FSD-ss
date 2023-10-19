package com.files;

import java.io.*;

public class FileReader {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("");
		BufferedReader br = new BufferedReader(fr);
		String str = br.readLine();
		
		while(str!=null) {
			System.out.println();
		}
	}

}
