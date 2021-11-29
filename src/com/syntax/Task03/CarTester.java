package com.syntax.Task03;

public class CarTester {
    public static void main(String[] args) {
        Sedan sedan = new Sedan();
        sedan.carPrice=25000;
        sedan.color="White";
        sedan.length=25;
        sedan.calculateSalePrice();

        Truck truck = new Truck();
        truck.carPrice=45000;
        truck.color="Blue";
        truck.weight=2000;
        truck.calculateSalePrice();


    }
}
