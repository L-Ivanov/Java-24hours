package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        new Battlepoint();
        HashMap<String, Long> asd = new HashMap<>();
        asd.put("Hello", 21L);
        Long number = asd.getOrDefault("Hell", -1L);
        System.out.println(number);
        asd.entrySet().stream().forEach(stringLongEntry -> {
            System.out.printf("%s - %d", stringLongEntry.getKey(), stringLongEntry.getValue());
        });
        System.out.println();
        for(Map.Entry<String, Long> entry : asd.entrySet()){
            String key = entry.getKey();
            Long value = entry.getValue();
            System.out.print(key + " , ");
            System.out.print(value);
        }

    }



}
