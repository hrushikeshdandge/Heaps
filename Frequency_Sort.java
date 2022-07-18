
import java.io.*;
import java.util.*;


public class Frequency_Sort
{
    

    public int[] Frequency(int a[])
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

       PriorityQueue<Integer> maxheap=new PriorityQueue<Integer>((a1,b1)-> freq.get(a1)-freq.get(b1));

       maxheap.addAll(freq.keySet());

       int temp[]=new int[freq.size()];

        for(int i=0;i<freq.size();i++)
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
        Frequency_Sort obj=new Frequency_Sort();
    
        
        int lis[]=obj.Frequency(a);

        for(int i : lis)
        {
            System.out.println(i);
        }

       
        
    }
}