package com.company;

public class MT extends XeComponent{
    public MT(){
        name = "Toyota Vios 1.5E MT " + "có giá "+ 585 +" Triệu. " + "Phụ kiện đi kèm: ";
    }
    @Override
    public double price() {
        return 585;
    }
}
