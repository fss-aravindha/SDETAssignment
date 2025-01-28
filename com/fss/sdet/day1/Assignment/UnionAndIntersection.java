package com.fss.sdet.day1.Assignment;
import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersection {

    public static void main(String[] args) {
        HashSet A = new HashSet<>();
        HashSet B = new HashSet<>();

        A.add(10);
        A.add(11);
        A.add(16);
        A.add(17);

        B.add(10);
        B.add(11);
        B.add(15);
        B.add(22);

        // Union of a set
        HashSet union = new HashSet<>(A);
        union.addAll(B); 
        System.out.println("Union of A and B: " + union);

        //Intersection of Set
        HashSet intersection=new HashSet<>(A);
        intersection.retainAll(B);
        System.out.println("Intersection of A and B: " + intersection);


    }

}