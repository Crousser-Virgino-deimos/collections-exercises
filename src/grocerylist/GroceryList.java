package grocerylist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
//        import java.util.Map;


public class GroceryList {


    private String name;
    private ArrayList<String> foods;
    HashMap<String, String> groceryStore = new HashMap<>();


    public GroceryList(String name) {
        this.name=name;
        this.foods = new ArrayList<>();
    }


    public String getFoodName() {
        return this.name;
    }


    public void addFood(String food) {
        foods.add(food);
        System.out.println(foods);
    }


    static ArrayList<String> someFoods = new ArrayList<>();



    public static void main(String[] args) {
        GroceryList groceries = new GroceryList("");
        System.out.println(groceries.getFoodName());
        groceries.addFood("Banana");
        groceries.addFood("Apple");
    }




}

