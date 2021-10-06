import java.io.*;
import java.util.*;
public class OddEven
 { 
 public static void main(String args[])throws IOException,FileNotFoundException
  {
  int i;
   File f1=new File("/home/exam/file1.txt");
   File f2=new File("/home/exam/file2.txt");
   File f3=new File("/home/exam/file4.txt");
   FileInputStream fin=new FileInputStream(f1);
   FileOutputStream op1=new FileOutputStream(f2);
   FileOutputStream op2=new FileOutputStream(f3);
   do
    {
     i=fin.read();
     if(i%2==0)
     {
      op1.write(i);
     }
     else
     {
     op2.write(i);
     }
   }
   while(i!=-1);
   op1.close();
   op2.close();
   fin.close();
 }
 }
