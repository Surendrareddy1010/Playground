import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
  //  import java.util.Scanner;
//class Main
//{
  //public static void main(String args[])
  //{
    //Try your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int list[]=new int[n];
    for(int idx=0;idx<=n-1;idx++)
    {
      list[idx]=sc.nextInt();
    }
   // System.out.println(max_ele(list[],n));
    int max=0;
    for(int idx=0;idx<n;idx++)
    {
      if(list[0]>list[1])
        max=0;
      else
        max=1;
    }
    for(int idx=2;idx<n;idx++)
    {
      if(list[max]<list[idx])
      {
        max=idx;
      }
      
    }
    System.out.println(max);
    
  }
  
}