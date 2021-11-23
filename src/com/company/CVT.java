package com.company;

public class CVT extends XeComponent{
    public CVT(){
        name = "Toyota Vios 1.5E CVT "+ "có giá "+ 600 +" Triệu. " + "Phụ kiện đi kèm: ";
    }
    @Override
    public double price() {
        return 600;
    }
}
