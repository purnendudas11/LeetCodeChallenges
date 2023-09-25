package org.example.challenge;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {

    public int result(int[] arr) {
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (index == 0 || arr[index - 1] != arr[i]) {
                arr[index] = arr[i];
                index++;
            }
        }

        for(int i=index;i<arr.length;i++){
            arr[i]=0;
        }

        System.out.println(Arrays.toString(arr));

        return index;
    }

//    public static void main(String[] args) {
//
//        //Remove Duplicate from Sorted Array
//        //Input: nums = [0,0,1,1,1,2,2,3,3,4]
//        //Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
//
//        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
//        System.out.println(result(arr));
//
//    }
}
