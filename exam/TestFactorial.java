import java.io.*;
import java.util.*;
class Fact
{
int fact=1;
 int i;
 public void cal()
 {
System.out.println("enter a number: ");
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 for(i=1;i<=n;i++)
 {
   fact=fact*i;
 }
 System.out.println("Factorial: "+fact);
}
}
public class TestFactorial
{
public static void main(String args[])
{
 Fact f1=new Fact();
 f1.cal();
}
}
 
