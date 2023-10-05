package MergeList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static public void main(String[] args)
    {
        List<int[]> intervals=new ArrayList<>();
        System.out.println("Enter the total number of intervals");
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();


        for(int i=0;i<size;i++)
        {
            int[]singleInterval=new int[2];
            System.out.println("Enter the starting interval");
            singleInterval[0]=s.nextInt();

            System.out.println("Enter the ending interval");
            singleInterval[1]=s.nextInt();

            intervals.add(singleInterval);
        }
        MergeOverlappingInterval obj=new MergeOverlappingInterval();
        obj.mergeIntervals(intervals);
    }
}
