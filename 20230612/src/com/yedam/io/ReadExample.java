package com.yedam.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("c:/temp/test1.db");
		while(true) {
			int data = is.read();
			if(data ==-1) {
				break;
			}System.out.println(data);
		}
		is.close();
	}
}
