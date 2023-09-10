package geek_java_oop_lesson1;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        Product product1 = new Product();
        //product1.name = "Product1";
        //product1.brand = "Brand1";
        //product1.price = 200;
        System.out.println(product1.displayInfo());

        /*Product product2 = new Product("", "Brand2", -100);
        System.out.println(product2.displayInfo());
        double price = product2.getPrice();
        System.out.println(price);*/

        /*Product product3 = new Product("Product3");
        //product3.price = -100;
        //product3.name = "A";
        System.out.println(product3.displayInfo());*/

        Product bottleOfMilk1 =
                new BottleOfMilk("Бутылка с молоком", "ООО Молоко", 350, 1.5, 15);
        System.out.println(bottleOfMilk1.displayInfo());

        Product bottleOfWater1 =
                new BottleOfWater("Бутылка с водой", "Кашинская", 150, 1.5);
        System.out.println(bottleOfWater1.displayInfo());

        Product bottleOfMilk2 =
                new BottleOfMilk("Бутылка с молоком", "ООО Молоко", 250, 1.5, 5);
        System.out.println(bottleOfMilk2.displayInfo());

        Product bottleOfWater2 =
                new BottleOfWater("Бутылка c водой", "Кашинская", 100, 1.0);
        System.out.println(bottleOfWater2.displayInfo());

        Product chips1 = new Chips("Чипсы", "Lays", 100, 200, "паприка");
        System.out.println(chips1.displayInfo());

        List<Product> products = new ArrayList<>();
        products.add(bottleOfMilk1);
        products.add(bottleOfMilk2);
        products.add(bottleOfWater1);
        products.add(bottleOfWater2);
        products.add(chips1);

        VendingMachine vendingMachine = new VendingMachine(products);
//        BottleOfWater bottleOfWater = vendingMachine.getBottleOfWater("Бутылка с водой", 1.5);
//        if (bottleOfWater != null){
//            System.out.println("Вы получили: ");
//            System.out.println(bottleOfWater.displayInfo());
//        }
//        else {
//            System.out.println("Такой бутылки нет в автомате.");
//        }

        Chips chips = vendingMachine.getChips("Чипсы", "паприка");
        if (chips != null){
            System.out.println("Вы получили: ");
            System.out.println(chips.displayInfo());
        }
        else {
            System.out.println("Такие чипсы отсутствуют.");
        }

    }
}