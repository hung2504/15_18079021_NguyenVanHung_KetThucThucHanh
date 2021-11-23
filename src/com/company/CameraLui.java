package com.company;

public class CameraLui extends GiaXeDecorator {
    XeComponent xe;

    public CameraLui(XeComponent xe) {
        this.xe = xe;
    }

    public String getDescription() {
        return xe.getName() + " Camera lùi " + 5 + " Triệu, ";
    }

    public double price() {
        return 5 + xe.price();
    }
}