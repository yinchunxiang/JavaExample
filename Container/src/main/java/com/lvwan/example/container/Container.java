package com.lvwan.example.container;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static com.sun.tools.internal.xjc.reader.Ring.add;

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

    }
}
