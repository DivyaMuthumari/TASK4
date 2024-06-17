package com.task4;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Set;

public class Collectionclasses {

    public static void main(String[] args) {

        List<Integer> list=new ArrayList<Integer>();
        Vector<Integer> vector=new Vector<Integer>();
        TreeSet< Integer> treeSet=new TreeSet<Integer>();
        Set<Integer> set=new HashSet<Integer>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        list.remove(2);

        list.forEach(x-> System.out.println(x));//lambda expression


            vector.add(55);
            vector.add(66);
            vector.add(77);
            vector.add(88);
        vector.remove(3);
        vector.forEach(x -> System.out.println(x));



                treeSet.add(99);
                treeSet.add(100);
                treeSet.add(111);
                treeSet.add(112);
                treeSet.add(122);
                treeSet.remove(4);

                treeSet.forEach(x-> System.out.println(x));


                set.add(133);
                set.add(144);
                set.add(155);
                set.add(166);

                set.remove(2);

                set.forEach(x->System.out.println(x));


            }

        }













