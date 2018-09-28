package com.company;

import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {


        //Create ArrayList to save items in grocery bag
        ArrayList<ItemPrice> myList = new ArrayList<>();


        String quit = " ";




        //ask user for input item

        while (true) {
            //Create object to keep all information about item
            ItemPrice grocery = new ItemPrice();

            Scanner kb = new Scanner(System.in);
            //ask for user to input name of item
            System.out.println("Enter the item: ");
            String itemName = kb.nextLine();
            if (itemName.equalsIgnoreCase("end")) {
                break;
            }
            grocery.setItemName(itemName);
            //ask for user to input price of item
            System.out.println("Enter the price");
            double itemPrice = kb.nextDouble();
            grocery.setPrice(itemPrice);
          //  System.out.println("Enter the quantity");
           // int itemQuantity = kb.nextInt();
          //  grocery.setQuantity(itemQuantity);
            Random random = new Random(); //create a Random object to use a number as quantity of numbers

            int randNumber = random.nextInt(10)+1;
            System.out.println("Your random number: " + randNumber );
            grocery.setQuantity(randNumber);
            double itemCost = itemPrice * randNumber;
            grocery.setCost(itemCost);
            System.out.println( "Cost is: " + itemCost);


            myList.add(grocery); //add our grocery bag in ArrayList


        }
        System.out.println("Item" + "\t" + "Price" + "\t" + "Quantity" + "\t" + "Cost");

        int totalItemPurchase = 0;
        double totalPerchaseAmmount = 0;
        for (ItemPrice item : myList) {

            System.out.println(item.getItemName() +  "\t" + "$" + item.getPrice() +  "\t"+ item.getQuantity() + "\t\t\t" + "$" + item.getCost());
            totalPerchaseAmmount += item.getCost();
            totalItemPurchase += 1;






            // write your code here
        } System.out.println("The total purchase amount is: " + "$" + totalPerchaseAmmount );
        if (totalPerchaseAmmount > 20.0){
            System.out.println("You spent too much today....");
        } else {
            System.out.println("Thank you for shopping at my market!");
        }
        System.out.println("The total item purchase is: " + totalItemPurchase);




    }
}
