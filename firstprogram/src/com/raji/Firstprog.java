package com.raji;

public class Firstprog {
	 int rollno;
	String stu_name; // instance variables
	static String clg_name = "SVCE"; // ststic variable

	// constructor without parameters
	public Firstprog() {
		
		  rollno=9; stu_name="raji";
		  
		  //Constuctor with Parameters
		/*  
		 * public Firstprog(int r, String s) {
		 * 
		 * rollno = r; stu_name = s; }
		 */
	}

	void results() {
		String msg = "marksheet";  //Local Variable
		System.out.println(msg + " " + rollno + " " + stu_name + " " + clg_name);

	}

	public static void main(String[] args) {
		Firstprog firstprog = new Firstprog();
		firstprog.results();
		
		 
	}
}
