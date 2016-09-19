/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package quicksort;
import java.util.*;

public class QuickSort {
    private  int [] array = new int [10];   // Initialize an array with 10 elements
     int higherIndex;
    
    public void sort(int [] array_unsorted){
        if (array_unsorted == null || array_unsorted.length == 0){  // Make sure that array is not null
            return;
           }
        this.array = array_unsorted;
        this.higherIndex = array_unsorted.length;
        getquicksort(0 , higherIndex-1);  // Calling Quicksort Algorithm
    }
    
    public void getquicksort(int lowerIndex, int higherIndex){
        
        int i = lowerIndex;
        int j = higherIndex;
        int pivot = array [(lowerIndex + (higherIndex - lowerIndex)/2)];
        System.out.println("\n--------------------------------------------------------------------------------------");
        System.out.println(" \n Before loop LowerIndex is : " +lowerIndex +" HigherIndex is : " +higherIndex +" Pivot :" +pivot);
        
        while (i<=j){
            System.out.print("\n i is " +i + " j is " +j);
            while (array[i]<pivot){i++;}    // Check all the elements to pivot are lower
            while (array[j]>pivot){j--;}    // checking all the elements to pivot are higher
                if (i<=j){  // if (j > i) means all elements are already sorted
                     exchnage(i,j);
                        System.out.print("\n i is " +i + " j is " +j);
                        i++;
                        j--;
                }
                
                System.out.print("\n");
                for (int a=0;a<array.length;a++){    // Printing array after each iteration -- Just Info
                    System.out.print(" " +array[a] + " ");
                }
                        
        }
        
        // Calling QuickSort method recurssively
        
        if (lowerIndex<j){  
            getquicksort(lowerIndex,j);
            System.out.print("\n");
            System.out.println(" LowerIndex is : " +lowerIndex +"  J is " +j);
        }
   
        if (i < higherIndex){
            getquicksort(i,higherIndex);
            System.out.println(" higherIndex is : " +higherIndex +"  I is " +i);
        }
        
        System.out.println(" \n After the first iteration LowerIndex is : " +lowerIndex +" HigherIndex is : " +higherIndex +" Pivot :" +pivot);
    }
    
    
     public void exchnage(int i , int j){   // Exchanging elements : Higher to the right and lower to the left
        int temp = array[i];
        array [i] = array[j];
        array [j] = temp;
    
        }
     
     
    public static void main(String[] args) {
        
        int [] array = new int [10];    // Initialize an array with 10 elements
        Random rm = new Random();   // Created object to create random number
        int random;
            for (int i = 0; i<array.length;i++){    // Added 10 random elements in the array
                random = rm.nextInt(50);
                array[i]= random;
            }
            
                System.out.print("###########################################");
                System.out.print("\n");
            for (int a : array){    // Printing Original Array
                 System.out.print(" " +a + " ");
            }
                System.out.print("\n ###########################################");
        
        QuickSort obj = new QuickSort();    // Creating an object for a class
        obj.sort(array);    //Calling Sorting Method
        
        
                
                System.out.print("###########################################");
                System.out.print("\n");
            for (int a : array){    // Printing Sorted Array
                System.out.print(" " +a + " ");
            }
                System.out.print("\n ###########################################");
        
    }
    
}
