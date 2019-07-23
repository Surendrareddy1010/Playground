import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner sc=new Scanner(System.in);
      int b=sc.nextInt();
      int e=sc.nextInt();
      int count=0;int res=1;
      while(count<e)
      {
        res=res*b;
        count++;
      }
      System.out.println(res);
      
    }
}