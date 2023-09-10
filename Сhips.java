package geek_java_oop_lesson1;

public class Сhips extends Product{
    private double weight; // Вес
    private String flavored; // Вкус
    public Сhips(String name, String brand, double price, double weight, String flavored){
        super(name, brand, price);
        this.weight = weight;
        this.flavored = flavored;

    }

    public double getWeight() {
        return weight;
    }

    public String getFlavored() {
        return flavored;
    }

    @Override
    public String displayInfo(){
        return String.format("[Чипсы] %s - %s - %.2f - w: %.2f - %s", name, brand, price, weight, flavored);
    }
}
