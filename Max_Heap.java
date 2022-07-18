import java.io.*;
import java.util.*;
public class Max_Heap
{
    int heap[];
    int size=0;
    Max_Heap(int size)
    {
        this.size=size;
        heap=new int[size];
    }

    //max_heapfify
    public void Max_heapfiy(int heap[],int pos)
    {
        int l=2*pos+1;
        int r=2*pos+2;
        int n=heap.length();
        if(!(pos>(n/2) && pos < n))
        return;

        if(heap[l]>heap[pos] || heap[r]>heap[pos])
        {
            if(heap[l]>heap[pos])
            {
                int temp=heap[l];
                heap[l]=heap[pos];
                heap[pos]=temp;
                Max_heapfiy(heap,l);
            }
            else
            {
                int temp=heap[r];
                heap[r]=heap[pos];
                heap[pos]=temp;
                Max_heapfiy(heap,r);
            }
        }
    }

    //insert in heap

    public void insert(int heap[],int element)
    {
        
    }
}