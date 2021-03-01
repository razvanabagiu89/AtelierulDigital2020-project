import Factory.Car;
import Factory.CarFactory;
import Observer.Mechanic;
import Strategy.Client;
import Strategy.RandomDiscount;
import Strategy.WeeklyDiscount;

public class Main {
    public static void main(String[] args) throws Exception {

        // initialize the factory with all the cars produced in this year
        CarFactory factory = new CarFactory();

        Car car1 = factory.produceCar("muscle", "Dodge Challenger",  "automatic");
        Car car2 = factory.produceCar("muscle", "Ford Mustang", "manual");
        Car car3 = factory.produceCar("comfort", "Mercedes S-Klass",  "automatic");
        Car car4 = factory.produceCar("sports", "Audi TT",  "manual");
        Car car5 = factory.produceCar("muscle", "Dodge Charger",  "manual");
        Car car6 = factory.produceCar("comfort", "Toyota Camry",  "automatic");
        Car car7 = factory.produceCar("comfort", "Audi Q8",  "automatic");
        Car car8 = factory.produceCar("sports", "Toyota Supra",  "manual");
        Car car9 = factory.produceCar("sports", "Nissan GTR",  "automatic");
        Car car10 = factory.produceCar("sports", "BMW X6M",  "automatic");

        // add the cars to the register where we keep the record of everything
        Dealership dealership = Dealership.getInstance();

        dealership.addCar(car1); dealership.addCar(car2);
        dealership.addCar(car3); dealership.addCar(car4);
        dealership.addCar(car5); dealership.addCar(car6);
        dealership.addCar(car7); dealership.addCar(car8);
        dealership.addCar(car9); dealership.addCar(car10);

        // first show all cars to the client
        dealership.exposeCars();

        // take cars for a testDrive, a testDrive adds 30km to the car
        dealership.testDrive(car1);
        dealership.testDrive(car2);
        dealership.testDrive(car3);

        // before selling a car, a mechanic must check it
        Mechanic mechanic = new Mechanic();

        mechanic.addObserver(car1); mechanic.addObserver(car2); mechanic.addObserver(car3);
        mechanic.addObserver(car4); mechanic.addObserver(car5); mechanic.addObserver(car6);
        mechanic.addObserver(car7); mechanic.addObserver(car8); mechanic.addObserver(car9);
        mechanic.addObserver(car10);
        System.out.println("--------------------------------------------------------------");

        // checking the cars, in output we can see their problems
        mechanic.checkCar(car1);
        mechanic.checkCar(car6);
        mechanic.checkCar(car7);

        // generate some clients
        Client mike = new Client();
        Client john = new Client();

        // they can have two types of discounts on the dealership cars
        // 1. A random discount
        RandomDiscount randomDiscount = new RandomDiscount();
        // 2. A weekly discount
        WeeklyDiscount weeklyDiscount = new WeeklyDiscount();

        mike.setStrategyDiscount(randomDiscount);
        john.setStrategyDiscount(weeklyDiscount);

        // mike wants a discount on the 1st car, and john on the 7th
        Car mikeCar = null;
        Car johnCar = null;
        try {
            mikeCar = dealership.searchCar(car1);
            johnCar = dealership.searchCar(car7);

        } catch (Exception e) {
            System.out.println("This car is not available");
        }

        mike.getStrategyDiscount().negotiate(mike);
        mike.applyDiscount(mikeCar);

        john.getStrategyDiscount().negotiate(john);
        john.applyDiscount(johnCar);

        // mike wants to buy the car so the dealership will sell it
        dealership.sellCar(mikeCar);

        System.out.println("--------------------------------------------------------------");
        // we no longer see the car mike bought
        dealership.exposeCars();

    }
}
