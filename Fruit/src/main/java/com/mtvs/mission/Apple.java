package com.mtvs.mission;

public class Apple implements Cuttable {
    private String name;
    private String color;
    private double price;

    // 생성자
    public Apple(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    // Getter 및 Setter 메서드
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String cut() {
        return "사과 껍질을 깎습니다";
    }
}
