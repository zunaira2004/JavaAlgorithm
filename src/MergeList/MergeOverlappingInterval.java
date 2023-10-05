package MergeList;

import java.util.ArrayList;
import java.util.List;

public class MergeOverlappingInterval {

   public void mergeIntervals(List<int[]> interval)
   {
       for(int i=0;i<interval.size()-1;i++)
       {
           if(interval.get(i)[1]>=interval.get(i+1)[0])
           {
               if(interval.get(i)[1]<interval.get(i+1)[1])
               {
                   interval.get(i)[1]=interval.get(i+1)[1];
               }
               interval.remove(i+1);
               i--;
           }

       }
       this.display(interval);
   }
   public void display(List<int[]> interval)
   {
       for(int i=0;i< interval.size();i++)
       {
           System.out.println("{"+interval.get(i)[0]+","+interval.get(i)[1]+"}");
       }
   }
}
