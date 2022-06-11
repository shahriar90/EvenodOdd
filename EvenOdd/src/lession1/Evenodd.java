package lession1;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	int x;
	System.out.println("Enter any positive integer: ");
	x = scan.nextInt();
	if (x%2==0) {
	System.out.println("Even");
	}else {
	System.out.println("odd");
	}

	}

}
