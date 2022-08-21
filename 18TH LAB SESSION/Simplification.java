// Q.1 Write a Java program to find the value of specified expression.
package javaproject;

public class Simplification {

	public static void main(String[] args) {
		int a = (120+30)/3;
		double b = 3.0-6* 10000000.1;
		boolean c = false && true;
		boolean d = true && true;
		boolean e = (false && false) || (true && true);
		boolean f = (false || false) && (true && true);
		
		System.out.println("(120+30)/3->"+a);
		System.out.println("(3.0e-6* 10000000.1)->"+b);
		System.out.println("(false && true)->"+c);
		System.out.println("( true && true)->"+d);
		System.out.println("(false && false) || (true && true)->"+e);
		System.out.println("(false || false) && (true && true)->"+f);

	}

}
1