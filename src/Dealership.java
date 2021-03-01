import Factory.Car;

import java.util.ArrayList;

public class Dealership {

    private static Dealership instance = new Dealership();
    public static Dealership getInstance() {
        return instance;
    }

    private ArrayList<Car> register;
    private int nrCars = 0;

    public Dealership() {
        this.register = new ArrayList<>();
    }

    public void addCar(Car car) {
        register.add(car);
        nrCars++;
    }

    public void sellCar(Car car) {
        register.remove(car);
        nrCars--;
    }

    public Car searchCar(Car car) throws Exception {
        int index = register.lastIndexOf(car);
        if(index == -1) {
            throw new Exception("This car is not in our possession");
        }
        else return register.get(index);
    }

    public void testDrive(Car car) {
        // test drive is limited to only 30 kms
        int index = register.lastIndexOf(car);
        if(index == -1) {
            System.out.println("This car is not in our possession");
            return;
        }
        else {
            Car currentCar = register.get(index);
            currentCar.setKilometers(currentCar.getKilometers() + 30);
        }
    }

    public ArrayList<Car> getRegister() {
        return register;
    }

    public void exposeCars() {
        System.out.println("Current cars in dealership: ");
        System.out.println(register);
    }
}
