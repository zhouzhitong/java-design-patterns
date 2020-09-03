package com.zzt.behavioral.strategy;

import java.util.Arrays;

/**
 * 描述：<br>
 * </>
 *
 * @author 周志通
 * @version 1.0.0
 * @date 2020/9/3 17:23
 */
public class Client {

    public static void main(String[] args) {

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("小米",3,12);
        cats[1] = new Cat("小米",3,13);
        cats[2] = new Cat("小米",1,11);
        Arrays.sort(cats);
        System.out.println(Arrays.toString(cats));
    }

}
