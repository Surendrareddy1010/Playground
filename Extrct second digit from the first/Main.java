import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
     int temp;
      for(temp=num;temp>0;)
      {
        if(temp<99)
        {
          System.out.println((temp%100)%10);
          break;
        }
        else
        {
          temp=temp/10;
        //   System.out.println(temp);
        }
      }}}
    