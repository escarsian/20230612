package com.yedam.Memo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileEx2 {
	public static void main(String[] args) {
		try {
//			FileOutputStream fos = new FileOutputStream("20230612/src/com/yedam/memo/sample.txt");
//			fos.write(10);
//			fos.close();
//			 MemoApp.java 파일을 읽어서 화면(콘솔)에 출력.
			InputStream is = new FileInputStream("20230612/src/com/yedam/memo/MemoApp.java");
			InputStreamReader isr = new InputStreamReader(is); // 바이트-> 문자변환. 보조스트림.
			BufferedReader br = new BufferedReader(isr); // 성능향상 보조스트림.
			String str = "";
			
			while( (str=br.readLine()) != null) {
				System.out.println(str);
			}
			br.close();
			isr.close();
			is.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end of prog.");
	}
}
