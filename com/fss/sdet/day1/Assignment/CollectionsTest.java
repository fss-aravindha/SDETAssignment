package com.fss.sdet.day1.Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionsTest {

    public static void main(String[] args) {

        // Array List`
        ArrayList arrayList = new ArrayList<Integer>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(40);
        arrayList.add(60);
        arrayList.add(80);
        System.out.println(arrayList);

        // List in Ascending Order & printing order sorted list
        Collections.sort(arrayList);
        arrayList.forEach(arr -> System.out.print(arr + " "));
        System.out.println();
        // Creating Hash Set
        HashSet set = new HashSet<String>();
        set.add("a");
        set.add("b");
        set.add("f");
        set.add("c");
        set.add("d");
        set.add("b");
        set.add("e");
        set.add("f");

        Iterator<String> it = set.iterator();

        while (it.hasNext()) {
            String setPrint = it.next();
            System.out.print(setPrint+ " ");

        }
        System.out.println();

        //Hashmap for storing names & keys, printing the HashMap
        HashMap map=new HashMap<>();
        map.put("Aravind", 80);
        map.put("Kuamr", 90);

        //Printing Using entrySet
        map.entrySet().forEach(System.out::println);

        //Printing using values
        map.values().forEach(System.out::println);

        //Printing using keyset
        map.keySet().forEach(System.out::println);
    }

}
