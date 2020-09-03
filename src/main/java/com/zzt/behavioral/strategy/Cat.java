package com.zzt.behavioral.strategy;

import java.util.Comparator;

/**
 * 描述：<br>
 * </>
 *
 * @author 周志通
 * @version 1.0.0
 * @date 2020/9/3 17:11
 */
public class Cat implements Comparable<Cat> {

    private String name;
    private Integer age;
    private Integer bodyWeight;

    public Cat() {
    }

    public Cat(String name, Integer age, Integer bodyWeight) {
        this.name = name;
        this.age = age;
        this.bodyWeight = bodyWeight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", bodyWeight=" + bodyWeight +
                '}';
    }

    @Override
    public int compareTo(Cat cat) {
        if (this.bodyWeight.equals(cat.bodyWeight)) {
            if (this.age > cat.age) {
                return 1;
            } else {
                return -1;
            }
        } else if (this.bodyWeight > cat.bodyWeight) {
            return 1;
        } else {
            return -1;
        }
    }

}
