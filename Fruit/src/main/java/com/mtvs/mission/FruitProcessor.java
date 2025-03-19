package com.mtvs.mission;

public class FruitProcessor<T extends Peelable> {
    private T fruit;

    public FruitProcessor(T fruit) {
        this.fruit = fruit;
    }

    public String process() {
        return fruit.peel();
    }
}
