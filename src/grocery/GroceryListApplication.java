package grocery;

import util.Input;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

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
//TODO: if they pick yes, they will be prompted if they would like to enter a new item
        //prompt user if they want a new item
        System.out.println("Would you like to make a new list? [y/n]");
        if (input.yesNo()) {
            //prompt user for category
            //TODO: if the user's pick yes, they should be given the following three prompts:
            System.out.println("Select a category: ");
            System.out.println(input.getString());
            System.out.println("Enter name of item: ");
            System.out.println(input.getString());
            System.out.println("Enter how many you want: ");
            System.out.println(input.getInt());


            //declare hash map for groceries
            HashMap<String, ArrayList<String>> groceries = new HashMap<>();
            groceries.put("Bakery", new ArrayList<>());
            groceries.put("Fruit", new ArrayList<>());
            groceries.put("Meat", new ArrayList<>());
            groceries.put("Vegetables", new ArrayList<>());
            System.out.println("Would you like to enter a new item [y/n]");
            input.yesNo();
            if (input.yesNo()) {

                String category;
                String name;
                int quantity;







                //TODO: given an ordered list of grocery categories to choose from, select the category
                //TODO: Enter name of the item
                //TODO: Enter how many of the item


                //TODO:  give the user a choice to finalize the list or add an additional item


                //TODO: when finalized, present a complete list organized ALPHABETICALLY and grouped by CATEGORY including QUANTITY
            }
        }
    }
}