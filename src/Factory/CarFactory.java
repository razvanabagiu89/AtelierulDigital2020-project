package Factory;

public class CarFactory {

    public Car produceCar(String type, String name, String shift) {
        return switch (type) {

            case "muscle" -> new MuscleCar(name, shift);
            case "sports" -> new SportsCar(name, shift);
            // automatic by default because it is a comfort car
            case "comfort" -> new ComfortCar(name,"automatic");
            default -> null;
        };
    }
}
