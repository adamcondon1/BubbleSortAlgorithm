/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubbleinsertionca1;

import java.util.ArrayList;

/**
 *
 * @author adamc
 */
public class MyArrayList <ElemType> extends ArrayList<ElemType>{
     public void bubbleSort()
    {
       int cm = 0;
       int sw = 0;
       int i,j;
       Comparable  elemAtJ,elemAtJPlus;
       for (i=0; i < size(); i++ )
       {

	  for (j=0; j < size()-1 -i ; j++ )
	  {
              elemAtJ = (Comparable)get(j);
              elemAtJPlus = (Comparable)get(j+1);
              cm++;
	      if (elemAtJ.compareTo(elemAtJPlus) < 0)
	      {
                  swap(j, j+1);
                  sw++;
	      }
           }
       }
       System.out.println("Bubble Comparisons:" +cm);
       System.out.println("Bubble Swaps:" +sw);

     }

     public void swap(int pos1, int pos2)
     {
         ElemType objPos1 = get(pos1);
         remove(pos1);
         add(pos2, objPos1);
    }

    public void insertionSort()
    {
        int sw = 0;
        int cm = 0;
        int i;
        int pos;
        ElemType keyelement;
        for (i = 1; i< size();i++)
        {
            keyelement = get(i);
            pos = i;  
            cm++;

            while (pos > 0 && ((Comparable)get(pos-1)).compareTo((Comparable)keyelement) <0)
            {
                ElemType elemPosMinusOne = get(pos-1);
                set(pos, elemPosMinusOne);
                pos = pos -1;
            } 
              sw++;
            set(pos,keyelement); 
        }
       System.out.println("Insertion Comps:" +cm);
       System.out.println("Insertion Swaps:" +sw);
  }  
     
    
}
