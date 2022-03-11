package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashSet<City> cityHashSet = new HashSet<City>(Set.of(
                new City(312, "Bishkek"),
                new City(3223, "Bishkek"),
                new City(3222, "Bishkek"),
                new City(313, "Bishkek"),
                new City(316, "Bishkek")));

        TreeSet<City> cities = new TreeSet<>(cityHashSet);
        for (City c: cities) {
            if (c.getCode() % 2 != 0){
                System.out.println(c);
            }

        }


    }


}
