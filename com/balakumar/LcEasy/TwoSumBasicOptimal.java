package com.balakumar.LcEasy;

import java.util.HashMap;
import java.util.Map;
public class TwoSumBasicOptimal {

    public static int[] twoSum(int[] arr , int target) {
        Map<Integer , Integer >  numMap = new HashMap<Integer, Integer>();
        for(int i=0 ; i <= arr.length; i++) {
            int complement = target - arr[i];

            if(numMap.containsKey(complement)){
                return new int[] {numMap.get(complement) , i};
            }
            else {
                numMap.put(arr[i], i);
            }
        }
        return new int[] {};

    }

    public static void main(String[] args) {

        int arr[] =  {1,1,3,4,5};
        int  Newresult[] =  twoSum( arr, 8);

        for(int i=0 ; i < Newresult.length; i++) {
            System.out.println(Newresult[i]);
        }

    }
}
