//import java.util.Scanner;
//public class PrimeNum {
//
//	public static void main(String[] args) {
//int[] arr= {2,3,4,5,6,7,8,9};
//for (int i= 0; i<=arr.length-1;i++) {
//	boolean isprime = true;
//	for(int j=2; j<arr[i];j++) {
//		if (arr[i]%j==0) {
//			isprime=false;
//			break;
//		}
//	}
//	if (isprime==true)
//	System.out.println("The given number is.."+ " "+arr[i]);
//}
//
//	}
//
//	}



//public class PrimeNum {
//
//	public static void main(String[] args) {
//Scanner sc= new Scanner(System.in);
//System.out.println("Enter any positive num");
//int n= sc.nextInt();
//
//boolean isprime = true;
//for (int i= 0; i<=n;i++) {
//for(int j=2; j<n/2; j++){
//            if (n%j==0) {
//
//	isprime=false;
//	break;
//		}
//	}
//	if (isprime==true)
//	System.out.println("The given number is.."+ " "+n);
//}
//
//	}
//
//	}











import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("Enter any positive num");
int n= sc.nextInt();

boolean isprime = true;
for (int i= 0; i<=n;i++) {

            if (n%2==0) {

	isprime=false;
	break;
                   }
	}
	if (isprime==true)


	System.out.println("The given number is Prime num.."+ " "+n);

else
         System.out.println("The given number is not Prime num.."+ " "+n);
}

	}

	




