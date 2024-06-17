package com.task4;

import java.util.HashMap;
import java.util.Map;
public class Hashmap {
    public static void main(String[] args) {
        Map<String, Integer> map= new HashMap<>();
        map.put("Abi", Integer.valueOf("89"));
        map.put("Bhaskar", Integer.valueOf("90"));
        map.put("Chitra", Integer.valueOf("67"));
        map.put("Deena", Integer.valueOf("54"));
         System.out.println(map.replace("Bhaskar", Integer.valueOf("9")));
        System.out.println(map.get("Abi"));
        map.remove("Chitra");
        System.out.println(map.put("raju", Integer.valueOf("78")));
       for(Map.Entry<String, Integer> m:map.entrySet()) {
           System.out.println(m.getKey() + " " + m.getValue());




    }

}}



