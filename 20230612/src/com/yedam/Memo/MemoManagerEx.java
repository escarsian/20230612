package com.yedam.Memo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemoManagerEx {
	List<Memo> storage = new ArrayList<>();
	Scanner scn = new Scanner(System.in);

	MemoManagerEx() {

	}

	// 등록.
	public void inputDateEx() {
		System.out.println("번호> ");
		int no = Integer.parseInt(scn.nextLine());
		System.out.println("날짜> ");
		String date = scn.nextLine();
		System.out.println("내용> ");
		String content = scn.nextLine();
		
		storage.add(new Memo(no, date, content));
	}
	//조회.
	public void searchDataEx() {
		System.out.println("날짜> ");
		String date = scn.nextLine();
		boolean sd = false;
		for(int i=0; i<storage.size();i++) {
			if(date.equals(storage.get(i).getDate())) {
				System.out.println(storage.get(i));
				sd= true;
			}
		}
		if(!sd) {
			System.out.println("해당 날짜의 메모는 없습니다.");
		}
	}
	//삭제.
	public void deleteDataEx() {
		System.out.println("번호> ");
		int no = Integer.parseInt(scn.nextLine());
		boolean dD = false;
		for(int i=0; i< storage.size(); i++) {
			if(no==storage.get(i).getNo()) {
				storage.remove(i);
				dD = true;
			}
		}
		if(!dD) {
			System.out.println("해당 번호가 없습니다.");
		}
	}
	
	// 파일 저장.
	public void storeToFileEx() {
		try {
			FileOutputStream fos = new FileOutputStream("c:/temp/memobook.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(storage);
			oos.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
	}
}
