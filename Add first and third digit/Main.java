import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
       Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=(n1/100);
      int n3=(n1%10);
      int add=(n2+n3);
      System.out.println(add);
	}
}