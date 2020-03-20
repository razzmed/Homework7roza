package com.company;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        Scanner s1 = new Scanner(System.in);
        System.out.println("Введите 5 имен");
        listA.add(s1.nextLine());
        listA.add(s1.nextLine());
        listA.add(s1.nextLine());
        listA.add(s1.nextLine());
        listA.add(s1.nextLine());

        Iterator<String> iteratorA = listA.iterator();
        while (iteratorA.hasNext()) {
            String nameA = iteratorA.next();
            System.out.println(nameA);
        }
        System.out.println("_______________________________");

        ArrayList<String> listB = new ArrayList<>();
        Scanner s2 = new Scanner(System.in);
        System.out.println("Введите еще 5 имен");
        listB.add(s2.nextLine());
        listB.add(s2.nextLine());
        listB.add(s2.nextLine());
        listB.add(s2.nextLine());
        listB.add(s2.nextLine());

        Iterator<String> iteratorB = listB.iterator();
        while (iteratorB.hasNext()) {
            String nameB = iteratorB.next();
            System.out.println(nameB);
        }
        System.out.println("_______________________________");

        ArrayList<String> listC = new ArrayList<>();

        for (int i = 0; i < listA.size(); i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(i));
        }
        Collections.addAll(listC);

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
        for (String str : listC) {
            System.out.println(str);
        }
    }
}
