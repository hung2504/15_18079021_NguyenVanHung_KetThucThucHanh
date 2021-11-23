package com.company;

public class AT extends XeComponent{
    public AT(){
        name = "Toyota Vios 1.5G AT " + "có giá "+ 625 +" Triệu. " + "Phụ kiện đi kèm: ";
    }
    @Override
    public double price() {
        return 625;
    }
}