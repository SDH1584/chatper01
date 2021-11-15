package com.javaex.ex03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[]args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("점수: ");
		int num= sc.nextInt();
		
		
	if(num>=60)//60점이상이냐고ㅓ 물어보기
		
		System.out.println("합격입니다");
	
	
		sc.close();
	}
	
	
}
