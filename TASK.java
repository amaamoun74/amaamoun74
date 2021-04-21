package task;

import java.util.HashMap;

public class TASK {
    
    public static void main(String[] args) {
        //	Declaring array 
        int [] arr = new int [] {4,1,2,3,2,4,6,5,5,6,2,3,4,4,4};
      //	Using HashMap for prevent duplicate elements 
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        System.out.println("No Duplication");
        for (int i = 0; i < arr.length ; i++) {
            if (hashmap.get(arr[i]) == null )
            {    
                System.out.println(arr[i] );
            }           
             hashmap.put(arr[i],1); 
       
        }
        //	Printing sorted elements with key set of the HashMap
        System.out.println("Sorted Elements");
        System.out.print(hashmap.keySet());
       
    }
}
