package com.test1;

import java.util.Scanner;

public class Jt {
	public static void main(String[] args) {
		int a = new Scanner(System.in).nextInt();
		for (int i = a-1 ; i > 0 ; i--) {
			a = a * i ;
			a++;
		}
		System.out.println(a);
	}
}
