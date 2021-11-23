package com.company;

public class CameraHanhTrinh extends GiaXeDecorator {
    XeComponent xe;

    public CameraHanhTrinh(XeComponent xe) {
        this.xe = xe;
    }

    public String getDescription() {
        return xe.getName() + " Camera Hành Trình " + 8 + " Triệu, ";
    }

    public double price() {
        return 8 + xe.price();
    }
}