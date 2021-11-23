package com.company;

public class Main {

    public static void main(String[] args) {
        XeComponent xe1 = new AT();
        xe1 = new ManHinh(xe1);
        System.out.println(xe1.getName() + xe1.getDescription() +" Tổng giá trị là: "
                 + xe1.price() + "Triệu!");
    }
}
