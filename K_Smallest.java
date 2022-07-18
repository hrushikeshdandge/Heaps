import java.io.*;
import java.util.*;
public class K_Smallest
{
    public int small(int a[],int k)
    {
        PriorityQueue<Integer> max=new PriorityQueue<Integer>(Collections.reverseOrder());
        
        for(int i=0;i<a.length;i++)
        {
            max.add(a[i]);
            if(max.size()>k)
            {
                max.remove();
            }
        }
        return max.peek();
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
        K_Smallest obj=new K_Smallest();
        System.out.println("Enter the kth smallest number");
        int k=sc.nextInt();
        System.out.println("Kth smallest number is " + obj.small(a,k));
    }
}