package org.homeTask.Decorator;

public class SportsCar extends CarDecorator {
    public SportsCar(Car c) {
        super(c);
    }

    @Override
    public void assemble(){
        car.assemble();
        System.out.print(" Adding features of Sports Car.");
    }
    @Override
    public long carPrice(){
        return 4000000;
    }
}
