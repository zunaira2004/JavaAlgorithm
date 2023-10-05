package MergeList;

import java.util.ArrayList;
import java.util.List;

public class MergeOverlappingInterval {

    List<int[]> intervals=new ArrayList<>();
   void mergeIntervals(List<int[]> interval)
   {

       for(int i=0;i<interval.size();i++)
       {
           int[] singleInterval=interval.get(i);
           if(i< interval.size())
           {
               int[] nextInterval=interval.get(i+1);
               if(singleInterval[1]>nextInterval[0])
               {
                   singleInterval[1]=nextInterval[1];
                   interval.remove(i+1);
               }
           }
           else if(i-1== interval.size())
           {
               break;
           }
       }
   }
}
