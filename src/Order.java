import java.util.Arrays;

public class Order {
    private String customer;
    private Product[] basket;

    public Order(String customer, Product[] basket) {
        this.customer = customer;
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "Заказ[покупатель=" + customer + ", корзина=" + Arrays.toString(basket) + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        if (basket.length != order.basket.length) return false;
        if (!customer.equals(order.customer)) return false;
        for (int i = 0; i < basket.length; i++) {
            Product p1 = basket[i];
            Product p2 = order.basket[i];
            if (p1 == null && p2 == null) continue;
            if (p1 == null || p2 == null) return false;
            if (!p1.equals(p2)) return false;
        }
        return true;
    }
}
