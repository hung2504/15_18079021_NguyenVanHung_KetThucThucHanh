package com.company;

public class ManHinh extends GiaXeDecorator{
    XeComponent xe;
    public ManHinh(XeComponent xe) {
        this.xe = xe;
    }
    public String getDescription() {
        return xe.getName() + " Màn hình 12 inch " + 7 +" Triệu, ";
    }
    public double price() {
        return 7 + xe.price();
    }
}
