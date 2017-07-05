# rrr
import java.io.*;
import java.util.*;
public class Integer
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
 int a,n,reverse=0,r;
 System.out.println("Enter any number");
 a=sc.nextInt();
 n=a;
 while(a>0)
 {
 r=a%10;
 reverse=reverse*10+r;
 a=a/10;
 }
 System.out.println(reverse);
 }
 }
 
