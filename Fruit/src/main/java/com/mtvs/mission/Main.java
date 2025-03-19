package com.mtvs.mission;

public class Main {
    public static void main(String[] args) {
        // Banana 객체 생성
        Banana banana = new Banana("바나나", 5, 1000.0);

        // FruitProcessor를 사용하여 바나나 처리
        FruitProcessor<Banana> bananaProcessor = new FruitProcessor<>(banana);
        System.out.println(bananaProcessor.process());

        // Apple 객체 생성
        Apple apple = new Apple("사과", "빨강", 1500.0);

        // FruitCutter를 사용하여 사과 처리
        FruitCutter<Apple> appleCutter = new FruitCutter<>(apple);
        System.out.println(appleCutter.process());
    }
}