/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubbleinsertionca1;

/**
 *
 * @author adamc
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

  MyArrayList<Integer> mylist;
        mylist = new MyArrayList<Integer>();

        mylist.add(new Integer("4"));
        mylist.add(new Integer("5"));
        mylist.add(new Integer("2"));
        
  
        
        MyArrayList<Integer> mylist2;
        mylist2 = new MyArrayList<Integer>();

        mylist2.add(new Integer("4"));
        mylist2.add(new Integer("5"));
        mylist2.add(new Integer("2"));
       
       
        System.out.println("The elements are: " +mylist.toString());

        mylist.bubbleSort();

        System.out.println("The elements after Bubble sort are: " +mylist.toString());

   
        mylist2.insertionSort();

        System.out.println("The elements after Insertion sort are: " +mylist2.toString());
     
    }


    
    
}
