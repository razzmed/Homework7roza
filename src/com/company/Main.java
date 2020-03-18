package com.company;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Введите 5 имен");
        String strings1 = s1.nextLine();
        String strings2 = s1.nextLine();
        String strings3 = s1.nextLine();
        String strings4 = s1.nextLine();
        String strings5 = s1.nextLine();

        ArrayList<String> listA = new ArrayList<>();
        listA.add(strings1);
        listA.add(strings2);
        listA.add(strings3);
        listA.add(strings4);
        listA.add(strings5);

        Iterator <String> iteratorA = listA.iterator();
         while (iteratorA.hasNext()){
             String nameA = iteratorA.next();
             System.out.println(nameA);
         }

        Scanner s2 = new Scanner(System.in);
        System.out.println("Введите еще 5 имен");
        String strings6 = s2.nextLine();
        String strings7 = s2.nextLine();
        String strings8 = s2.nextLine();
        String strings9 = s2.nextLine();
        String strings10 = s2.nextLine();

        ArrayList<String> listB = new ArrayList<>();
        listB.add(strings6);
        listB.add(strings7);
        listB.add(strings8);
        listB.add(strings9);
        listB.add(strings10);

        Iterator <String> iteratorB = listB.iterator();
        while (iteratorB.hasNext()){
            String nameB = iteratorB.next();
            System.out.println(nameB);
        }
        System.out.println("_______________________________");

        ArrayList<String> listC = new ArrayList<>();
        listC.add(strings1);
        listC.add(strings10);
        listC.add(strings2);
        listC.add(strings9);
        listC.add(strings3);
        listC.add(strings8);
        listC.add(strings4);
        listC.add(strings7);
        listC.add(strings5);
        listC.add(strings6);

        Iterator <String> iteratorC = listC.iterator();
        while (iteratorC.hasNext()){
            String nameC = iteratorC.next();
            System.out.println(nameC);
        }
        System.out.println("_______________________________");

        Collections.sort(listC, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                    return 1;
                } else if (o1.length() < o2.length()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        for(String str : listC){
            System.out.println(str);
        }
    }
}
