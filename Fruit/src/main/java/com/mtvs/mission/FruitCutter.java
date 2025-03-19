package com.mtvs.mission;

public class FruitCutter<T extends Cuttable> {
    private T fruit;

    public FruitCutter(T fruit) {
        this.fruit = fruit;
    }

    public String process() {
        return fruit.cut();
    }
}