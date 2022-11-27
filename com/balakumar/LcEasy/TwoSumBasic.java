package com.balakumar.LcEasy;

public class TwoSumBasic {

    public static  int[] twoSum(int[] nums, int target) {
        int result[]  = new int[2];
        for(int i = 0 ; i < nums.length ; i++) {
            for (int j = i+1 ; j < nums.length ; j++) {
                if (nums[i] + nums[j] == target){
//                    result[0] = i;
//                    result[1] = j ;
                    return new int[] {i  ,j };
//                    break;
                }

            }
        }
        return result ;
    }


    public static void main(String[] args) {

//        System.out.println("bala");

        int arr[] =  {1,1,3,4,5};

       int Newresult[] =  twoSum( arr, 8);

       for(int i=0 ; i < Newresult.length; i++) {
           System.out.println(Newresult[i]);
       }
    }
}
