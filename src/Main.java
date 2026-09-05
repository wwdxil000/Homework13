public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Пончик", 1000, "Выпечка");
        System.out.println(product1);
        System.out.println();

        Product product2 = new Product(2, "Чизкейк", 1200, "Пироженые");
        System.out.println(product2);
        System.out.println();

        Product product3 = new Product(2, "Чизкейк", 1200, "Пироженые");
        System.out.println(product2);
        System.out.println();

        System.out.println(product1.equals(product2));
        System.out.println(product2.equals(product3));


        Order order1 = new Order("Олег", new Product[]{product1, product2});
        Order order2 = new Order("Олег", new Product[]{product1, product2});
        System.out.println(order1);
        System.out.println();
        System.out.println(order1);

        System.out.println(order1.equals(order2));

        Order order3 = new Order("Олег", new Product[]{product1, product2});
        Order order4 = new Order("Маша", new Product[]{product2, product3});
        System.out.println(order3);
        System.out.println();
        System.out.println(order4);

        System.out.println(order3.equals(order4));
    }
}