import java.io.*;
import java.util.*;
public class K_Largest
{
    public int small(int a[],int k)
    {
        PriorityQueue<Integer> min=new PriorityQueue<Integer>();

        for(int i=0;i<a.length;i++)
        {
            min.add(a[i]);

            if(min.size()>k)
            {
                min.remove();
            }
        }
        return min.peek();
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        K_Largest obj=new K_Largest();
        System.out.println("Enter the kth largest number");
        int k=sc.nextInt();
        System.out.println(k+" th Largest number is " + obj.small(a,k));
    }
}