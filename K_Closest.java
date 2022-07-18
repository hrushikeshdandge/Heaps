/* Using Pairs
import java.io.*;
import java.util.*;
class Pair
{
    int diff;
    int val;
    Pair(int diff,int val)
    {
        this.diff=diff;
        this.val=val;
    }
}
class MaxComparator implements Comparator<Pair>
{
    public int compare(Pair a,Pair b)
    {
        if(a.diff==b.diff)
        {
            return b.val-a.val;
        }
        else
        {
            return b.diff-a.diff;
        }

    }
}
public class K_Closest
{
   
    public List<Integer> closest(int a[], int k ,int x)
    {
        PriorityQueue<Pair> maxheap=new PriorityQueue<Pair>(new MaxComparator());

        for(int i=0;i<a.length;i++)
        {
            maxheap.add(new Pair(Math.abs(a[i]-x),a[i]));
            if(maxheap.size()>k)
            {
                maxheap.remove();
            }
        }
        List<Integer> lis=new ArrayList<Integer>();
        while(maxheap.size()>0)
        {
            lis.add(maxheap.poll().val);
        }
        Collections.sort(lis);
        return lis;
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
        K_Closest obj=new K_Closest();
        System.out.println("ENter the value of k");
        int k=sc.nextInt();
        System.out.println("ENter the value of x");
        int x=sc.nextInt();
        List<Integer> lis=obj.closest(a,k,x);

        for(int i : lis)
        {
            System.out.println(i);
        }
       
        
    }
} */

// using direct
import java.io.*;
import java.util.*;
public class K_Closest
{
    public List<Integer> closest(int a[],int k,int x)
    {
        PriorityQueue<Integer> maxheap=new PriorityQueue<>((a1,b1)->
        {
           
                int diff1=Math.abs(a1-x);
                int diff2=Math.abs(b1-x);
                if(diff1==diff2)
                {
                    return b1-a1;
                }
                else
                {
                    return diff2-diff1;
                }
            
        });

        for(int i=0;i<a.length;i++)
        {
            maxheap.add(a[i]);
            if(maxheap.size()>k)
            {
                maxheap.remove();
            }
        }
        List<Integer> lis=new ArrayList<Integer>();
        while(maxheap.size()>0)
        {
            lis.add(maxheap.poll());
        }
        Collections.sort(lis);
        return lis;
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
        K_Closest obj=new K_Closest();
        System.out.println("ENter the value of k");
        int k=sc.nextInt();
        System.out.println("ENter the value of x");
        int x=sc.nextInt();
        List<Integer> lis=obj.closest(a,k,x);

        for(int i : lis)
        {
            System.out.println(i);
        }
       
        
    }
}