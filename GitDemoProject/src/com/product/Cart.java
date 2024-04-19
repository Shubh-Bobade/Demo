package com.product;

import java.util.Scanner;

public class Cart {
	public void cart(int input) {
		
		if(input > 0) {
			System.out.println("Select Payment method");			
		} else {
			System.out.println("Chooese atleast one pic");
		}
		
	}

	public static void main(String[] args) {

		System.out.println("inside cart class");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Quantity ");
		int input = sc.nextInt();
		
		Cart obj = new Cart();
		obj.cart(input);
	}

}
