package com.syntax.Task03;
/*Create a Class Car that would have the following fields: carPrice and color and method calculateSalePrice() which should be returning a price of the car.
Create 2 sub classes: Sedan and Truck. The Truck class has field as weight and has its own implementation of  calculateSalePrice() method in which returned price calculated as following:
if weight>2000 then returned price car should include 10% discount, otherwise 20% discount.
The Sedan class has field as length and also does it is own implementation of calculateSalePrice(): if length of sedan is >20 feet then returned car price
 should include 5% discount, otherwise 10% discount*/
public class Car {
    double carPrice;
    String color;

    public void calculateSalePrice(){}
}
class Sedan extends Car{
    int length;
    @Override

    public void calculateSalePrice(){
        if (length > 20){
            System.out.println("You will get a discount of "+(carPrice/100)*5);
        }else{
            System.out.println("You will get a discount of "+(carPrice/100)*10);
        }
    }

}
class Truck extends Car{

    int weight;

    @Override

    public void calculateSalePrice(){
        if (weight > 2000){
            System.out.println("You will get a discount of "+(carPrice/100)*10);
        }else{
            System.out.println("You will get a discount of "+(carPrice/100)*20);
        }
    }

}
