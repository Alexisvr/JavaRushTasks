package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String,String> map = new HashMap<>();
        map.put("Li", "Vova");
        map.put("Vu", "Kolya");
        map.put("Si", "Vasya");
        map.put("Su", "Chi");
        map.put("Ka", "Ka");
        map.put("Kim", "Loh");
        map.put("Sun", "Huy");
        map.put("Lak", "Vova");
        map.put("Lis", "Chi");
        map.put("Los", "Chi");
        return map;

    }


    public static void removeTheFirstNameDuplicates(HashMap map) {
        ArrayList<String> names = new ArrayList<>(map.values());
        for (int i = 0; i < names.size()-1; i++){
            String x = names.get(i);
            for (int j = i+1; j < names.size()-1; j++){
                if (x.equals(names.get(j)))
                    removeItemFromMapByValue(map, x);
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
