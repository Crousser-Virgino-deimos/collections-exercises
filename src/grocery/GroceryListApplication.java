package grocery;

import java.util.*;
import util.Input;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class GroceryListApplication {

    //declare variables
    private String item;
    private ArrayList<String> groceries;
    private String name;
    private String category;
    private int quantity;

    //TODO: prompt user if they want to make a grocery list
    //constructor
    public GroceryListApplication(String item) {
        this.item = item;
        this.groceries = new ArrayList<>();
    }

    public void create(String name, String category, int quantity) {
        this.name = item;
        this.category = category;
        this.quantity = quantity;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);
        Input input = new Input();
        ArrayList<String> Bakery = new ArrayList<>();
        ArrayList<String> Fruit = new ArrayList<>();
        ArrayList<String> Meat = new ArrayList<>();
        ArrayList<String> Vegetables = new ArrayList<>();
//TODO: if they pick yes, they will be prompted if they would like to enter a new item
        //prompt user if they want a new item
        System.out.println("Would you like to make a new list? [y/n]");


        //declare hash map for groceries
//        HashMap<String, ArrayList> count = new HashMap<>();
//
//        HashMap<String, Integer> bakeryCount = new HashMap<>();
//        HashMap<String, Integer> fruitCount = new HashMap<>();
//        HashMap<String, Integer> meatCount = new HashMap<>();
//        HashMap<String, Integer> vegetablesCount = new HashMap<>();
//        HashMap<String, Integer> finalCount = new HashMap<>();
        HashMap<String, ArrayList<String>> groceries = new HashMap<>();

        //grocery keys
        groceries.put("bakery", new ArrayList<>());
        groceries.put("fruit", new ArrayList<>());
        groceries.put("meat", new ArrayList<>());
        groceries.put("vegetables", new ArrayList<>());

        Bakery.add("bread");
        Bakery.add("cake");
        Bakery.add("donuts");

        Fruit.add("apple");
        Fruit.add("banana");
        Fruit.add("orange");

        Meat.add("beef");
        Meat.add("chicken");
        Meat.add("sausage");

        Vegetables.add("carrot");
        Vegetables.add("lettuce");
        Vegetables.add("spinach");


//
        if (input.yesNo()) {
            //prompt user for category
            //TODO: if the user's pick yes, they should be given the following three prompts:
            System.out.println("Select a category: ");
            for (String grocery : groceries.keySet()) {
                System.out.println(grocery);

            }
            //wrong condition to make the user choose one of the categories


            //when user chooses category bakery, fruit, etc., we need to sequentially
            //call the key with the coinciding string, and store the next user input into
            //the arrayList
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//            input.getString();
            for (String bakery : groceries.keySet()) {
                System.out.println(groceries.get(input.getString()));
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Enter name of item: ");
                System.out.println(groceries);
            }

            //conditional for user input
            //add accordingly to string


            System.out.println("Enter how many you want: ");

            System.out.println(input.getInt());
            System.out.println("git");


            System.out.println("Would you like to enter a new item [y/n]");
            input.yesNo();

        } else if (input.yesNo()) {
            System.out.println("Select a category: ");
            for (String grocery : groceries.keySet()) {
                System.out.println(grocery);

            }
            //wrong condition to make the user choose one of the categories


            //when user chooses category bakery, fruit, etc., we need to sequentially
            //call the key with the coinciding string, and store the next user input into
            //the arrayList
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            input.getString();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("fruit Enter name of item: ");
            System.out.println(Fruit.add(input.getString()));
            System.out.println(Fruit);

            //conditional for user input
            //add accordingly to string


            System.out.println("Enter how many you want: ");

            System.out.println(input.getInt());
            System.out.println("git");


            System.out.println("Would you like to enter a new item [y/n]");
            input.yesNo();
        }

            //for each loop for user input


            //TODO: given an ordered list of grocery categories to choose from, select the category
            //TODO: Enter name of the item
            //TODO: Enter how many of the item


            //TODO:  give the user a choice to finalize the list or add an additional item

            //TODO: if they pick yes, they will be prompted if they would like to enter a new item


            //TODO: when finalized, present a complete list organized ALPHABETICALLY and grouped by CATEGORY including QUANTITY

        }


//    public static Map totalOrder(HashMap checkout) {
//        Map<String, Float> map = new TreeMap<>(checkout);
//        return map;
//
//    }
    }


