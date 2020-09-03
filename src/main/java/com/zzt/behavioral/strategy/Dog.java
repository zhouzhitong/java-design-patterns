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
public class Dog implements Comparator<Dog> {

    private String name;
    private Integer age;
    private Float weight;

    public Dog() {
    }

    public Dog(String name, Integer age, Float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Float getWeight() {
        return weight;
    }

    @Override
    public int compare(Dog dog, Dog t1) {
        if (this.weight < dog.getWeight()) {
            return -1;
        } else if (this.weight.equals(dog.getWeight())) {
            return 0;
        } else {
            return -1;
        }
    }
}
