import java.io.*;
import java.util.*;


public class K_Top_Frequency
{
    

    public int[] Frequency(int a[],int k)
    {
       HashMap<Integer,Integer> freq=new HashMap<>();

       for(int i : a)
       {
        if(freq.containsKey(i))
        {
            freq.put(i,freq.get(i)+1);
        }
        else
        {
            freq.put(i,1);
        }
       }

       PriorityQueue<Integer> maxheap=new PriorityQueue<Integer>((a1,b1)-> freq.get(b1)-freq.get(a1));

       maxheap.addAll(freq.keySet());

       int temp[]=new int[k];

        for(int i=0;i<k;i++)
        {
            temp[i]=maxheap.poll();
        }
        return temp;
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
        K_Top_Frequency obj=new K_Top_Frequency();
        System.out.println("ENter the value of k");
        int k=sc.nextInt();
        
        int lis[]=obj.Frequency(a,k);

        for(int i : lis)
        {
            System.out.println(i);
        }

       
        
    }
}