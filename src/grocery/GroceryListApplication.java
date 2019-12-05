package grocery;

import util.Input;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GroceryListApplication {

    //declare variables
    private String item;
    private ArrayList<String> groceries;

    //TODO: prompt user if they want to make a grocery list
    //constructor
    public GroceryListApplication(String item) {
        this.item = item;
        this.groceries = new ArrayList<>();
    }

    public static void main(String[] args) {

        Input input = new Input();
        boolean exited = false;

        if (Input.yesNo("Would you like to create a grocery list y/n?")) {

            HashMap<String, ArrayList<String>> groceries = new HashMap<>();

            groceries.put("Bakery", new ArrayList<>());
            groceries.put("Fruit", new ArrayList<>());
            groceries.put("Meat", new ArrayList<>());
            groceries.put("Vegetables", new ArrayList<>());
            do {
                if (input.yesNo("Would you like to enter a new item y/n?")) {
                    String category;
                    String name;
                    int quantity;


            //TODO: if they pick yes, they will be prompted if they would like to enter a new item

            //TODO: if the user's pick yes, they should be given the following three prompts:


            //TODO: given an ordered list of grocery categories to choose from, select the category
            //TODO: Enter name of the item
            //TODO: Enter how many of the item


            //TODO:  give the user a choice to finalize the list or add an additional item


            //TODO: when finalized, present a complete list organized ALPHABETICALLY and grouped by CATEGORY including QUANTITY
        }
    }
}