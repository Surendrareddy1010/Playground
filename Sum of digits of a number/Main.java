import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sum=0;
      int input=n;
      while(input!=0)
      {
        int last_digit=(input%10);
        sum+=last_digit;
        input/=10;
      }
      System.out.println(sum);
	}
}