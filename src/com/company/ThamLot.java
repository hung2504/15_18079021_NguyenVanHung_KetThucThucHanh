package com.company;

public class ThamLot extends GiaXeDecorator {
    XeComponent xe;

    public ThamLot(XeComponent xe) {
        this.xe = xe;
    }

    public String getDescription() {
        return xe.getName() + " Thảm lót sàn " + 1 + " Triệu, ";
    }

    public double price() {
        return 1 + xe.price();
    }
}
