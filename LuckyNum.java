
public class LuckyNum {

	public static void main(String[] args) {
      int []arr= {1998,2002,8684,9848,1904};
      for (int i=0;i<=arr.length-1;i++) {
    	  int sum=0;
    	  while(arr[i]>0||sum>9) {
    		  if (arr [i]%10==0){
    			 arr[i]=sum;
    			 sum=0;
    		  }
    		  int rem=arr[i]%10;
    		  sum=sum+rem;
    		  arr[i]=arr[i]/10;
    	  }
       System.out.println("this is Lucky"+" "+sum);
      }
	}

}
