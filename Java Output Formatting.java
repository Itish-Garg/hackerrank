import java.util.Scanner;

public class Solution 
{

    public static void main(String[] args) 
    {
           Scanner sc=new Scanner(System.in);
           System.out.println("================================");
           for(int i=0;i<3;i++)
           {
              String s1=sc.next();
              int x=sc.nextInt();
              System.out.printf("%-15s",s1);
              System.out.printf("%03d\n",x);              //here"%03d" specify a left padding of zeros to get total length of 3 characters
              //System.out.printf("%-15s%03d\n", s1, x); // -15s specify a width a total width of 15 characters including string followed by spaces
           }
            System.out.println("================================");
            
     }
  }



