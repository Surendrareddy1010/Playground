import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
     Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int first=n1/100;
    int mid=((n1/10)%10);
    int last=n1%10;
  //  System.out.println(first);
   //System.out.println(mid);
    //System.out.println(last);
    int z=(last*100)+(mid*10)+(first);
    System.out.println(z);
  }
}