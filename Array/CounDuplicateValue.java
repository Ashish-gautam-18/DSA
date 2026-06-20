
                    //count the duplicate value

package web.string.array;

public class CounDuplicateValue {

	public static void main(String[] args) {
		
		
		int [] arr= {10,20,20,10,10,30,40};
		
		for (int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1; j<arr.length;j++) {
				
				if (arr[i]==arr[j]) {
					
					count++;
					arr[j]=0;
					
						}
				}
		           if(arr[i]!=0) {
					System.out.println(arr[i]+"----->"+count);
      		}
		}
	}

}




        // Here second Example of count duplicate value


//				
//			public class CounDuplicateValue {
//				
//					public static void main(String[] args) {
//					
//				int [] arr= {2,3,4,2,3,6,7,8,6,9,2,5,7,9};
//				for (int i=0; i<arr.length; i++) {
//				int count=1;
//				for (int j=i+1; j<arr.length; j++) {
//				if (arr[i]==arr[j]) {
//					count++;
//					arr[j]=0;
//					
//				}
//				}
//				if (arr[i]!=0) {
//				System.out.println(arr[i]+"------>"+count);
//				}
//				
//				}
//				}
//				
//				}