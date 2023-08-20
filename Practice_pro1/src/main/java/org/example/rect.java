package org.example;

import java.util.*;
public class rect {
    public static void main(String[] args){
        Scanner n=new Scanner(System.in);

        int[] arr={1,2,4,6,3,8,8,6,11};
        // to print first set of even numbers
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.print(arr[i]+" ");
                if(arr[i+1]%2!=0)
                    break;
            }
        }


    }
}
