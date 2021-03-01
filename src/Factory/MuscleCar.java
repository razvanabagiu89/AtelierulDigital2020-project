package Factory;

import java.util.Observable;
import java.util.Random;

public class MuscleCar implements Car {

    private String name;
    private int year;
    private double kilometers;
    private String engine;
    private String shift;
    private int price;
    private double topSpeed;
    private double acceleration;
    private int nrSeats;
    private boolean isBroken;

    public MuscleCar(String name, String shift) {
        Random rand = new Random();


        this.name = name;
        this.year = 2021;
        this.kilometers = rand.nextInt(2500);
        this.engine = "V8";
        this.shift = shift;
        this.price = 1000;
        this.topSpeed = 220.00;
        this.acceleration = 160.00;
        this.nrSeats = 4;
    }

    @Override
    public boolean isBroken() {
        return isBroken;
    }

    @Override
    public void setBroken(boolean broken) {
        isBroken = broken;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public double getKilometers() {
        return kilometers;
    }

    @Override
    public void setKilometers(double kilometers) {
        this.kilometers = kilometers;
    }

    @Override
    public String getEngine() {
        return engine;
    }

    @Override
    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String getShift() {
        return shift;
    }

    @Override
    public void setShift(String shift) {
        this.shift = shift;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public double getTopSpeed() {
        return topSpeed;
    }

    @Override
    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public double getAcceleration() {
        return acceleration;
    }

    @Override
    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }

    @Override
    public int getNrSeats() {
        return nrSeats;
    }

    @Override
    public void setNrSeats(int nrSeats) {
        this.nrSeats = nrSeats;
    }

    @Override
    public String toString() {
        return "MuscleCar: " + name + " " + engine + " " + shift + " " + "price of: " + price +
                " number of kilometers: " + kilometers + "\n";
    }

    /**
     * This method is called whenever the observed object is changed. An
     * application calls an {@code Observable} object's
     * {@code notifyObservers} method to have all the object's
     * observers notified of the change.
     *
     * @param o   the observable object.
     * @param arg an argument passed to the {@code notifyObservers}
     */
    @Override
    public void update(Observable o, Object arg) {
        this.isBroken = true;
    }
}
