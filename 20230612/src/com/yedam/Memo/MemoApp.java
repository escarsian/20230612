package com.yedam.Memo;

import java.util.Scanner;

public class MemoApp {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in); // 키보드 통해서 값을 입력.
		int choice;

		MemoManager app = new MemoManager();

		while (true) {
			try {
				System.out.println("1.등록 2.검색 3.삭제 4.종료");
				System.out.print("선택> ");
				choice = Integer.parseInt(scn.nextLine());

				switch (choice) {
				case MENU.INSERT:
					app.inputDate();
					break;
				case MENU.SEARCH:
					app.searchData();
					break;
				case MENU.DELETE:
					app.deleteData();
					break;
				case MENU.EXIT:
					app.storeToFile();
					throw new ExitException();  // 종료 처리.
				}
			} catch (ExitException e) {
				break;
			}
		}
		System.out.println("end of prog.");
		scn.close();
	}
}
