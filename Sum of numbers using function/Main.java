import java.util.Scanner;
class Main{
	public static void main (String[] args){
      
	    // Type your code here
       Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      
      System.out.println(sum_of_numbers(n));
}
  public static int sum_of_numbers(int n)
  {
    n=(n*(n+1))/2;
    return n;
   // int sum=0;
   /* while(n>0)
    {
      System.out.println(n);
      n=n-1;
      sum=sum+n;
    }return sum;*/
  }
}