
                  //  remove the duplicate value 10,20,20,10,10,30,40}

package web.string.array;

public class RemoveDuplicate {

	public static void main(String[] args) 
	{
       
	int [] arr= {10,20,20,30,10,10,30,40};
	for (int i=0;i<arr.length;i++) {
		for(int j=i+1; j<arr.length;j++) {
			
			if (arr[i]==arr[j]) {
				arr[j]=0;
			}
		}
		if (arr[i]!=0) {
			
			System.out.println(arr[i]);
			}
	}
	}
}
