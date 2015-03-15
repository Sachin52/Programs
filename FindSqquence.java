public class FindSqquence{

  public static void main(String[] args)
  {
    int[] arr = {23, 5, 4, 7, 2, 11};
    
    boolean bool = findSum(arr, 200);
    
    System.out.print("hii--?"+ bool + "    hai" );
  }
  
  public static boolean findSum (int[] A ,int T){
		int sum = 0 ;
		int j = 0;
		for (int i = 0 ; i < A.length ; ++i) {
			while (j < A.length &&  sum < T) {
				sum += A[j] ;
				j++;
			}			
			if (sum == T) {
				return true ;
			}
			sum -= A[i] ;
		}
						
		return false;
  }
}