package com.javaex.ex01;

public class Ex07 {
	
	public static void main (String[] args){
		
		//대입연자
		
		int a=7;
		int b=2;
	
	System.out.println("신술연산자");
	System.out.println(a + b);
	System.out.println(a - b);
	System.out.println(a * b);
	
	System.out.println(a / b); //3.5 몫 3 나머지 1 > 몫 표시
	System.out.println(a % b); // 3.5 몫3 나머지 1 >나머지표시

	//산술연산자 / %자세히
	System.out.println("산술연산자 자세히");
	System.out.println(7.0/2.0); //3.5
	System.out.println(7.0%2.0); //1.0
	
	
	//부호연산자
	System.out.println("부호연산자");
	int var =-3;
	int pVar=+var;
	int mVar =-var;
	
	System.out.println(pVar);   //  +(-3)  --> -3
	System.out.println(mVar);   //  -(-3)  --> 3
	
	
	//증감연산자
	System.out.println("증감연산자");
	System.out.println(a); //7
	System.out.println(++a); //1. a를 1 올린다 (7 >8) 2. a를 출력 (8)

	System.out.println(b);//2
	System.out.println(--b);//b를 1 내린다 b릋 출력
	System.out.println(b);//1
	
	System.out.println(a);//8
	System.out.println(a++); //a를 출력한다 a를 1 올린다
	System.out.println(a);//9
	
	System.out.println(b);//1
	System.out.println(b--);//b를 출력한다 b를 1 내린다
	System.out.println(b);//0
	
//	5==3 //5와 3이 같냐? false
//	5!=3 //5와 3이 같지않냐? true
//	
	}
}
