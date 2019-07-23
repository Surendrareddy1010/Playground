import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int first_num=num;
      while(first_num>=10)
      {
          first_num=(first_num/10);
      }
      int last_digit=(num%10);
      //System.out.println(first_num);
      //System.out.println(last_digit);
      int sum=first_num+last_digit;
      System.out.println(sum);
	}
}