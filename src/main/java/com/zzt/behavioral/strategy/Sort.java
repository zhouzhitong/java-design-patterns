package com.zzt.behavioral.strategy;

import java.util.Arrays;

/**
 * 描述：<br>
 * </>
 *
 * @author 周志通
 * @version 1.0.0
 * @date 2020/9/3 17:18
 */
public class Sort {

    // 升序
    public static void sort(Comparable<?>[] objs) {
        int j;
        for (int i = 1; i < objs.length; i++) {
            Comparable c = objs[j = i];
            while (j - 1 >= 0 && c.compareTo(objs[j - 1]) < 0) {
                objs[j] = objs[--j];
            }
            objs[j] = c;
        }
    }

    public static void main(String[] args) {

        Cat[] cats = new Cat[5];

        cats[0] = new Cat("小米", 3, 12);
        cats[1] = new Cat("小米", 3, 13);
        cats[2] = new Cat("小米", 1, 11);
        cats[3] = new Cat("小米", 1, 9);
        cats[4] = new Cat("小米", 1, 12);

        sort(cats);
        System.out.println(Arrays.toString(cats));


    }

}
