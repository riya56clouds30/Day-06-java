import java .util.*;
public class breakandcontinue{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     System.out.println("break example");
     for(int i=0;i<5;i++)
     {
        if(i==2)
        break;
        System.out.println(i);
     }
     System.out.println("continue example");
     for(int i=0;i<5;i++)
    {
     if(i==2)
     continue;
     System.out.println(i);
    }
    }
}