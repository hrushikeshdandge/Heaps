import java.io.*;
import java.util.*;
class Coordinate
{
    int x;
    int y;
    int z;
    Coordinate(int x,int y,int z)
    {
        this.x=x;
        this.y=y;
        this.z=z;
    }
}
class minComparator implements Comparator<Coordinate>
{
    public int compare(Coordinate o1, Coordinate o2)
    {       
            int x=2,y=3,z=5;
            double difference1 = Math.sqrt(Math.pow((o1.x - x),2)+Math.pow((o1.y - y),2)+Math.pow((o1.z - z),2));
            double difference2 = Math.sqrt(Math.pow((o2.x - x),2)+Math.pow((o2.y - y),2)+Math.pow((o2.z - z),2));
            int val=(int)difference1-(int)difference2;

            return val;
    }
}
public class test
{
   
       public static void main(String args[])
       {
             PriorityQueue<Coordinate> min=new PriorityQueue<Coordinate>(new minComparator());
            min.add(new Coordinate(1,2,3));
            System.out.println(min.peek().x);
       }
}