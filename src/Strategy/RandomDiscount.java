package Strategy;

import java.util.Random;

public class RandomDiscount implements Discount {
    @Override
    public void negotiate(Client client) {
        Random rand = new Random();

        // generate a discount between 1-50 %
        int discount = rand.nextInt(51);
        client.setWonDiscount(discount);
    }
}
