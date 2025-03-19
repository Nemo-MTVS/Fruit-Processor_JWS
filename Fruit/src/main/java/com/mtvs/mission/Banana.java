package com.mtvs.mission;

public class Banana implements Peelable {
    private String name;
    private int ripeness;
    private double price;

    // 생성자
    public Banana(String name, int ripeness, double price) {
        this.name = name;
        this.ripeness = ripeness;
        this.price = price;
    }

    // Getter 및 Setter 메서드
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRipeness() {
        return ripeness;
    }

    public void setRipeness(int ripeness) {
        this.ripeness = ripeness;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String peel() {
        return "바나나 껍질을 벗깁니다";
    }
}
