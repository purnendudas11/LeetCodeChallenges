package org.example.challenge;

import java.util.HashSet;
import java.util.Set;

public class ArrayContainsDuplicateElement {

    public boolean containsDuplicate(int[] numbers){
        Set<Integer> set=new HashSet<>();

        for(Integer number:numbers){
            if(set.contains(number)){
                return true;
            } else{
                set.add(number);
            }
        }
        return false;
    }
}
