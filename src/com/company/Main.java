package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String,String> testmap = createMap();
        getCountTheSameFirstName(testmap, "Александра"); //проверка
        getCountTheSameLastName(testmap, "Смирнов");
    }

    public static Map<String, String> createMap () {
        Map <String, String> map = new HashMap<>();
        map.put("Иванов", "Владимир");
        map.put("Петров", "Евгений");
        map.put("Смирнов", "Роман");
        map.put("Воробьева", "Анастасия");
        map.put("Крылова", "Александра");
        map.put("Быков", "Евгений");
        map.put("Дятлов", "Константин");
        map.put("Волкова", "Надежда");
        map.put("Зайцев", "Егор");
        map.put("Семенова", "Александра");
        return map;
    }
    public static int getCountTheSameFirstName(Map<String, String>map, String name) {
        int countName=0;
        for (Map.Entry<String, String> i : map.entrySet()) {
            if (name.equals(i.getValue()))
                countName++;
        }
        return countName;
        }
    public static int getCountTheSameLastName(Map<String, String>map, String lastname) {
        int countSurname=0;
        for (Map.Entry<String, String> j : map.entrySet()) {
            if (lastname.equals(j.getKey()))
                countSurname++;
        }
        return countSurname;
    }
}
