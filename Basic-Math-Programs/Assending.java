
public class Assending {

	public static void main(String[] args) {
		int [] arr = {8,2,4,3,6};
		int Temp=0;
		for (int i=0; i<arr.length-1;i++) {
			for (int j=i+1;j<=arr.length-1;j++) {
				if (arr[i] > arr[j]) {
				
				Temp=arr[i];
				arr[i]=arr[j];
				arr[j]=Temp;
				
		}					
	}
}
		    for (int k=0; k<=arr.length-1;k++)
	            System.out.println(arr[k]);
}
}
