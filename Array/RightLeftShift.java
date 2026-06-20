
                          //  sum first negative & last positive number



package web.string.array;

public class RightLeftShift {

 public static void main(String[] args) {
	
	
		int [] arr= {1,-2,4,3,-4,6,8,-9};
		int sum=0;
		int left=0;
		int right=arr.length-1;
		while(left<right) {
			if (arr[left]<0) {
				sum=sum+arr[left];
				break;
			}
		  left++;	
		}
		
		while(left<right) { 
			if (arr[right]>0) {
				sum=sum+arr[right];
				break;
			}
		  right--;	
		}
		System.out.println(sum);
			
		}
		
}	
		
