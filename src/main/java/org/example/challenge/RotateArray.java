package org.example.challenge;

import java.util.Arrays;

public class RotateArray {

    public int[] rotate(int[] nums,int k){
        int numsLength=nums.length;
        int[] res=new int[numsLength];

        for(int i=0;i<numsLength;i++){
            int pos=(i+k)%numsLength;
            res[pos]=nums[i];
        }

        for(int i=0;i<numsLength;i++){
            nums[i]=res[i];
        }

        System.out.println(Arrays.toString(nums));
        return nums;
    }
}
