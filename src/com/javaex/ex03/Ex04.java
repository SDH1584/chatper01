package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("근무시간 : ");
		int x=sc.nextInt();
		int y;
		if(x<=8)
		{
			y=10000;
			System.out.println(x*y);
		}
		else
		{
			y=12000;
			System.out.println(x*y);
		}
			
	sc.close();
	}
}