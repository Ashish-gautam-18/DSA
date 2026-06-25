import java.util.Scanner;

public class AmstrongNum {
public static void main(String[]args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter any number");
        int n= sc.nextInt();
 
	int original=n;
	double result = 0;
int power = String.valueOf(n).length();
while(n>0) {
	int rem=n%10;
	result=result+ Math.pow(rem,power);
	n=n/10;
}
if(result==original)
System.out.println("is amstrong number");
else 
	System.out.println("this is not Amstrong");
}

}

