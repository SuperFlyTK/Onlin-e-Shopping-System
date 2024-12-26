public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Laptop", 1500.00);
        Item item2 = new Item("Smartphone", 800.00);

        Customer customer1 = new Customer("Yerdaulet", "ahanoverda2007@gmail.com");
        Customer customer2 = new Customer("Nurislam", "nurislam@gmail.com");

        Order order1 = new Order(1, customer1, item1, 2);
        Order order2 = new Order(2, customer2, item2, 1);

        System.out.println(order1.toVerticalString());
        System.out.println(order2.toVerticalString());
        System.out.println("Are orders equal? " + order1.equals(order2));
    }
}
