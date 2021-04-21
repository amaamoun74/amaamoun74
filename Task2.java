package task2;

import java.util.ArrayList;
import java.util.List;


public class Task2 {

    public static void main(String[] args) {
        //	Declaring array 
        int [] arr = new int [] {12,3,2,5,8,1};
        
        //	Array sorting 
        for (int i = 0; i < arr.length; i++) {         
        int min_Element = arr[i]; 
        int min_Index = i;
        
        for (int j =i ; j < arr.length; j++) {
            if (arr[j] < min_Element ) 
            {
              min_Element = arr[j] ;
                min_Index = j;
            }
        }
            int var = arr[i];
            arr[i] = arr[min_Index];
            arr[min_Index]= var;
        
        }
        System.out.println("ARRAY AFTER SORTING ");
      for (int i = 0; i < arr.length; i++)
        {     
            System.out.println(arr[i]);
    }
           
           //	Get max element of array 
           int max = arr[0];
           for (int i = 0; i < arr.length; i++) {
               if (arr[i]>= max) {
                   int temp = arr[i];
                   arr[i] = max;
                   max= temp;
                   
               }            
        }
         // System.out.println(max);
        
         // 	Using list to fill missing numbers in 
          List<Integer> All_Numbers = new ArrayList<>();
          
           System.out.println("fill in Missing Numbers");
          for (int j = 1;  j<= max; j++) {
           All_Numbers.add(j);
        }
          System.out.print(All_Numbers);
      
    }
    
}
