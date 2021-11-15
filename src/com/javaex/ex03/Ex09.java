package com.javaex.ex03;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[]arsg) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("과목을 선택하세요");
		System.out.println("(1.java 2.c 3.c++ 4.파이썬)");
		System.out.print("과목번호: ");
		
		int subject=sc.nextInt();
		
		if(subject==1) 
		{
			System.out.println("R101호");
		}
		
		else if(subject==2) 
		{
			System.out.println("R202호");
		}
		else if(subject==3)
		{
			System.out.println("R303호");
		}
		
		else if(subject==4)
		{
			System.out.println("R404호");
		}
		
		else
		{
			System.out.println("\"상담원에게 문의하세요\"");
		}
	}
}
