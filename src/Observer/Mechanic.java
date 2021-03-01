package Observer;

import Factory.Car;

import java.util.Observable;
import java.util.Random;

public class Mechanic extends Observable {
    public void checkCar(Car car) {

        Random rand = new Random();
        int checkEngine = rand.nextInt(10);
        int checkCoolant = rand.nextInt(10);
        int checkTires = rand.nextInt(10);

        System.out.println("Mechanic: I'm checking the car...");
        System.out.println("This car is a " + car.toString());

        if(checkEngine % 5 == 0) {
            System.out.println("Mechanic: We need to replace the engine");
            setChanged();
            notifyObservers();
        }
        if(checkCoolant % 2 == 0) {
            System.out.println("Mechanic: Minor problem, we need to fill up the coolant");
            setChanged();
            notifyObservers();
        }
        if(checkTires % 3 == 0) {
            System.out.println("Mechanic: The tires are used, it needs new ones");
            setChanged();
            notifyObservers();
        }
        clearChanged();

        if(!car.isBroken()) {
            System.out.println("Mechanic: This car is in perfect shape, ready to be sold");
        }
        else {
            System.out.println("Mechanic: A couple of fixes and it will be the perfect car");
        }

        System.out.println("--------------------------------------------------------------");
    }
}
