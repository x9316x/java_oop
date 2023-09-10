package geek_java_oop_lesson1;

/*
 * Товар
 */
public class Product {
    // Состояния(поля)
    // Описываются переменными
    protected String name; // Наименование
    protected String brand; // Изготовитель
    protected double price; // Стоимость

//    // Accessor
//    // Метод, возвращающий цену товара
//    public  double getPrice(){
//        return price;
//    }
//
//    // Mutator
//    // Метод, изменяющий цену товара
//    public  void setPrice(double price){
//        this.price = price;
//    }


    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        checkName(name);

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        checkBrand(brand);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 100){
            throw new RuntimeException("Некорректная цена товара.");
        }
        this.price = price;
    }

    // Перегрузка конструктора (например, по количеству или типам)
    public  Product(){
        this("Noname");
    }

    public  Product(String name){
        this(name, "Noname");

    }
    public  Product(String name, String brand){
        this(name, brand, 100);

    }

    // Конструктор
    public  Product(String name, String brand, double price){
        if (price < 100){
            throw new RuntimeException("Некорректная цена товара.");
        }
        checkName(name);
        checkBrand(brand);
        this.price = price;
    }

    private void checkName(String name){
        if (name == null || name.length() < 3){
            this.name = "Noname";
        }
        else {
            this.name= name;
        }
    }

    private void checkBrand(String brand){
        if (brand == null || brand.length() < 3){
            this.brand = "Noname";
        }
        else {
            this.brand = brand;
        }
    }
    // Поведение(действия, которые может совершать объект)
    // Описываются методами
    public  String displayInfo(){
        return String.format("%s - %s - %.2f", name, brand, price);
    }
}
