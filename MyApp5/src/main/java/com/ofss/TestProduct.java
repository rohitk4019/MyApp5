package com.ofss;

public class TestProduct {

	public static void main(String[] args) {
		System.out.println("Starting the application");
		Stock st1=new Stock(100, "ORCL", 123.4);
		Stock st2=new Stock(101, "IBM", 1232.4);
		Stock st3=new Stock(102, "OFSS", 1200.4);
		Stock stocks[]= {st1,st2,st3};
		Customer c1=new Customer("Rohit",stocks);
		System.out.println(c1);
		System.out.println("=========================");
				

	}

}
