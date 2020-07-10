package com.raji;

public class Firstprog {
int a=9;
int b=8;
int c=4;

public void show() {
	int a=3;
	int b=44;
	System.out.println(a+b);
	System.out.println(a-b);
	System.out.println(a/b);
	System.out.println(a%b);
}


public static void main(String[] args) {
	Firstprog firstprog = new Firstprog();
	System.out.println(firstprog.a);
	System.out.println(firstprog.b);
	System.out.println(firstprog.c);
	firstprog.show();
}
}
