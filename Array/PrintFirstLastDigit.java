package web.string.array;

import java.util.Scanner;

public class PrintFirstLastDigit {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
	int firstn=0;
	int lastn=0;

	lastn=n%10;
	System.out.println("last digit of number : -"+lastn);
	while(n>0) {
		firstn=n%10;
		n=n/10;
	}
		 
			System.out.println("first digit of number : -"+firstn);
		

	}

}
