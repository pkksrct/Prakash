import java.util.Scanner;
import java.util.Arrays;
public class find
{
     public static void main (String[] args) 
     {
Scanner sc=new Scanner(System.in);
int d=sc.nextInt();
 int a[]=new int[d];
 int target=9;
 for(int i=0;i<d;i++)
 {
     a[i]=sc.nextInt();
 }
 for(int j=0;j<d;j++)
 {
     for(int k=1;k<d;k++)
     {
         if(a[j]+a[k]==target)
         {
             System.out.println(a[j]+" "+a[k]);
             //System.out.println(a[k]);
             
         }
     }
 }
