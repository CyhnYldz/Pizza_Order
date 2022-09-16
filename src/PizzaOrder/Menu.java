package PizzaOrder;

import java.util.Scanner;

public class Menu {


    public static void systemMenu()
    {

        System.out.println();

        System.out.println("1- Create Order");
        System.out.println("2- View Cart");
        System.out.println("3- Give Order");
        System.out.print("Please make your choice: ");


    }

public static void mainMenu(){
    System.out.println();
    System.out.println("********MENU********");
    System.out.println("1- "+Type.MARGARITA.typeName+" : "+Type.MARGARITA.typeAddPrice+"TL");
    System.out.println("2- "+Type.PEPPERONI.typeName+" : "+Type.PEPPERONI.typeAddPrice+"TL");
    System.out.println("3- "+Type.HAWAIIAN.typeName+" : "+Type.HAWAIIAN.typeAddPrice+"TL");
    System.out.println("4- "+Type.SEAFOOD.typeName+" : "+Type.SEAFOOD.typeAddPrice+"TL");
    System.out.println("5- "+Type.MEXICAN.typeName+" : "+Type.MEXICAN.typeAddPrice+"TL");
    System.out.println("6- "+Type.VEGETABLE.typeName+" : "+Type.VEGETABLE.typeAddPrice+"TL");
    System.out.println("7- "+Type.ITALIAN.typeName+" : "+Type.ITALIAN.typeAddPrice+"TL");
    System.out.println("8- "+Type.PEPPER_AND_HAM.typeName+" : "+Type.PEPPER_AND_HAM.typeAddPrice+"TL");
    System.out.println("9- "+Type.KEBAB.typeName+" : "+Type.KEBAB.typeAddPrice+"TL");
    System.out.print("Please select your Pizza: ");

}
public static void sizeMenu()
{
    System.out.println();
    System.out.println("Size Menu");
    System.out.println("1- "+Size.SLICE.sizeName);
    System.out.println("2- "+Size.SMALL.sizeName);
    System.out.println("3- "+Size.MEDIUM.sizeName);
    System.out.println("4- "+Size.LARGE.sizeName);
    System.out.print("Please select pizza size: ");

}

public static void ingredientMenu()
{
    System.out.println();
    System.out.println("Extra Ingredient Menu");
    System.out.println("1- "+Ingredient.PEPPERONI.ingredientName+" : +"+Ingredient.PEPPERONI.ingredientAddPrice+"TL");
    System.out.println("2- "+Ingredient.HAM.ingredientName+" : "+Ingredient.HAM.ingredientAddPrice+"TL");
    System.out.println("3- "+Ingredient.MUSHROOM.ingredientName+" : +"+Ingredient.MUSHROOM.ingredientAddPrice+"TL");
    System.out.println("4- "+Ingredient.BACON.ingredientName+" : +"+Ingredient.BACON.ingredientAddPrice+"TL");
    System.out.println("5- "+Ingredient.CHILI_PEPPER.ingredientName+" : +"+Ingredient.CHILI_PEPPER.ingredientAddPrice+"TL");
    System.out.println("6- "+Ingredient.ONION.ingredientName+" : +"+Ingredient.ONION.ingredientAddPrice+"TL");
    System.out.println("7- "+Ingredient.OLIVE.ingredientName+" : +"+Ingredient.OLIVE.ingredientAddPrice+"TL");
    System.out.println("8- "+Ingredient.CORN.ingredientName+" : +"+Ingredient.CORN.ingredientAddPrice+"TL");
    System.out.println("9- "+Ingredient.NON.ingredientName);
    System.out.print("Select Extra ingredient: ");
}

public static void doughMenu()
{
    System.out.println();
    System.out.println("Crust Types");
    System.out.println("1- "+Dough.STANDART.doughName);
    System.out.println("2- "+Dough.THICK.doughName+" : +"+Dough.THICK.doughAddPrice+"TL");
    System.out.println("3- "+Dough.THIN.doughName+" : +"+Dough.THIN.doughAddPrice+"TL");
    System.out.println("4- "+Dough.PARMESAN.doughName+" : +"+Dough.PARMESAN.doughAddPrice+"TL");
    System.out.println("5- "+Dough.BUTTER.doughName+" : +"+Dough.BUTTER.doughAddPrice+"TL");
    System.out.print("Select Crust: ");
}
}
