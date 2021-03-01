package Strategy;

public class WeeklyDiscount implements Discount{

    /*
    the weekly discount is set by default at 10 % to any of the cars
     */
    @Override
    public void negotiate(Client client) {
        client.setWonDiscount(10);
    }
}
