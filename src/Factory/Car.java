package Factory;

import java.util.Observer;

public interface Car extends Observer {

    public boolean isBroken();

    public void setBroken(boolean broken);

    public String getName();

    public void setName(String name);

    public int getYear();

    public void setYear(int year);

    public double getKilometers();

    public void setKilometers(double kilometers) ;

    public String getEngine();

    public void setEngine(String engine);

    public String getShift();

    public void setShift(String shift);

    public int getPrice();

    public void setPrice(int price);

    public double getTopSpeed();

    public void setTopSpeed(double topSpeed);

    public double getAcceleration();

    public void setAcceleration(double acceleration);

    public int getNrSeats();

    public void setNrSeats(int nrSeats);
}
