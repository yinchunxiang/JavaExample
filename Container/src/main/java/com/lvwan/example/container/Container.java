package com.lvwan.example.container;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


/**
 * Created by yinchunxiang on 07/06/2017.
 */



public class Container {
    public static void main(String[] args) {
        List<List<String>> ll = new ArrayList<List<String>>() {{
            add(new ArrayList<String>());
            add(new ArrayList<String>());
            add(new ArrayList<String>());
        }};

        ll.get(0).add("111");
        ll.get(1).add("222");
        ll.get(2).add("333");
        for (List<String> l : ll) {
            System.out.println(l);
        }

        House h = new House();
        System.out.println(h.getFurnitureList());
        h.getFurnitureList().add("table");
        System.out.println(h.getFurnitureList());

        List<String> strList = new ArrayList<String>();
        //strList.add("abc");
        List<String> after = strList.stream().filter(str ->  str.length() > 2 ).collect(Collectors.toList());
        System.out.println(after.size());

    }
}
