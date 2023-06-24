
public class Item {

    private String name;
    private int price;
    private float calories;
    private int quantity = 0;
    private int sold = 0;

     public Item (String name, int price, float calories, int quantity) {
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.quantity = quantity;
    }

    public Item (String name, int price, float calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setCalories(float calories) {
        this.calories = calories;
    }
    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public float getCalories() {
        return calories;
    }
    public int getQuantity() {
        return quantity;
    }
}