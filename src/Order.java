public class Order {
    private int orderId;
    private Customer customer;
    private Item item;
    private int quantity;

    public Order(int orderId, Customer customer, Item item, int quantity) {
        this.orderId = orderId;
        this.customer = customer;
        this.item = item;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Order{orderId=" + orderId + ", customer=" + customer + ", item=" + item + ", quantity=" + quantity + '}';
    }

    public String toVerticalString() {
        return "Order:" + "\n" +
                "  Order ID: " + orderId + "\n" +
                customer.toVerticalString() + "\n" +
                item.toVerticalString() + "\n" +
                "  Quantity: " + quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderId == order.orderId;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(orderId);
    }
}
