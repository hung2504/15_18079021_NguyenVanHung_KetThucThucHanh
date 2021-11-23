package com.company;

public abstract class XeComponent {
    String name = "Toyota";
    String description = "màn hình";
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public abstract double price();
}
