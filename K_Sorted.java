import java.io.*;
import java.util.*;
public class K_Sorted
{
    public void sort(int a[], int k)
    {
        PriorityQueue<Integer> min=new PriorityQueue<Integer>();

        int temp_array[]=new int[a.length];
        int j=0;

        for(int i=0;i<a.length;i++)
        {
            min.add(a[i]);
            if(min.size()>k)
            {
                temp_array[j]=min.peek();
                min.remove();
                j++;
            }
        }
        

        while(min.size()>0)
        {
            
            temp_array[j]=min.peek();
            min.remove();
            j++;
            
        }
        
        System.out.println("After sort ");

        for(int i=0;i<a.length;i++)
        {
            System.out.println(temp_array[i]);
        }
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
        K_Sorted obj=new K_Sorted();
        System.out.println("ENter the value of K");
        int k=sc.nextInt();
        obj.sort(a,k);
       
        
    }
}