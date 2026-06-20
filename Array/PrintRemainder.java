package web.string.array;

import java.util.Scanner;

public class PrintRemainder {

	public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
int count=0; int rem=0;
while (n>0) {
	rem=n%10;
	count++;
	n=n/10;
	if(count==1)
		System.out.println(rem);
		else if(count==5)
		System.out.println(rem);
}

	}
}

	
