package com.javaex.ex04;

public class Ex08 {
	public static void main(String[]args) {
		int i=0;		//비교할 정수 초기값
				 
		while (true) {
			i=i+1; //i++
			if(i%6==0 && i%14==0) {//6의 뱌수이면서 14의 배수입니꺄?
				System.out.println(i);
				break;
			}
		}
	}
}
