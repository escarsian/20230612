package com.yedam.Memo;

import java.util.Scanner;

public class MemoAppEx {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int choice;

		MemoManagerEx app = new MemoManagerEx();

		while (true) {
			try {
				System.out.println("1.등록 2.검색 3.삭제 4.종료");
				System.out.print("선택> ");
				choice = Integer.parseInt(scn.nextLine());

				switch (choice) {
				case MENU.INSERT:
					app.inputDateEx();
					break;
				case MENU.SEARCH:
					app.searchDataEx();
					break;
				case MENU.DELETE:
					app.deleteDataEx();
					break;
				case MENU.EXIT:
					app.storeToFileEx();
					throw new ExitException(); 
				}
			} catch (ExitException e) {
				break;
			}
		}
		System.out.println("end of prog");
		scn.close();
	}
}
