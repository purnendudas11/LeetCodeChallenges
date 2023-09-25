package org.example.challenge;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public int getSingleNumber(int[] numbers){

        Map<Integer,Integer> map=new HashMap<>();

        for(int number:numbers){
            if(map.containsKey(number)){
                map.put(number,map.get(number)+1);
            } else{
                map.put(number,1);
            }
        }

        Person person = new Person();

        return map.entrySet().stream().filter(e -> e.getValue() == 1).findFirst().get().getKey();

    }
}

