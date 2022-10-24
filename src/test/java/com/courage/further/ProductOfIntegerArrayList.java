package com.courage.further;

import java.util.ArrayList;
import java.util.List;

public class ProductOfIntegerArrayList {

    public static List<Integer> productArray(List<Integer> array){
        int product=1;
        List<Integer> newArray=new ArrayList<>();
       for (int i=0;i< array.size();i++){
           for (int j=0;j< array.size();j++){
               if (i==j) continue;
               product*=array.get(j);
           }
           newArray.add(product);
           product=1;
       }
        System.out.println(newArray.toString());
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        List<Integer> newArray=new ArrayList<>();
        newArray.add(2);
        newArray.add(8);
        newArray.add(1);
        newArray.add(3);
        productArray(newArray);

    }

}
