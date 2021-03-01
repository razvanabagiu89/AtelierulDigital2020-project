package Strategy;

import Factory.Car;

public class Client {

    private int wonDiscount;
    private Discount strategyDiscount;

    public int getWonDiscount() {
        return wonDiscount;
    }

    public void setWonDiscount(int wonDiscount) {
        this.wonDiscount = wonDiscount;
    }

    public Discount getStrategyDiscount() {
        return strategyDiscount;
    }

    public void setStrategyDiscount(Discount strategyDiscount) {
        this.strategyDiscount = strategyDiscount;
    }

    public void applyDiscount(Car car) {

        System.out.println("Price before discount: " + car.getPrice() + " for " + car.getName());
        int discount = wonDiscount;
        int currentPrice = car.getPrice();

        int newPrice = currentPrice - (discount * currentPrice / 100);
        car.setPrice(newPrice);
        System.out.println("Price after discount: " + newPrice);
    }
}
