package PizzaOrder;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderMain {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Scanner strscan=new Scanner(System.in);

        ArrayList<Integer>choices=new ArrayList<>();
        int systemChoice, typeChoice,sizeChoice,ingredientChoice,doughChoice;
        String extraChoice;
        ArrayList<Integer> extraIngredience=new ArrayList<>();
        System.out.println();
        System.out.print("*****WELCOME TO JAVA'S PIZZA*****");


        Menu.systemMenu();

        systemChoice=scan.nextInt();
        if (systemChoice==1) {
            Menu.mainMenu();
            typeChoice = scan.nextInt();
            Menu.sizeMenu();
            sizeChoice=scan.nextInt();
            do {
                System.out.print("Do you want Extra ingredience ? Y/N :  ");
                extraChoice=strscan.nextLine();
                if (extraChoice.equalsIgnoreCase("y"))
                { Menu.ingredientMenu();
                ingredientChoice=scan.nextInt();
                extraIngredience.add(ingredientChoice);}
                else continue;
            }while (!extraChoice.equalsIgnoreCase("n"));

            Menu.doughMenu();
            doughChoice=scan.nextInt();
            choices.add(typeChoice);
            choices.add(sizeChoice);
            choices.add(doughChoice);
            for (int ext:extraIngredience)
            {
                choices.add(ext);
            }

            //sepet ve fiyat için arraylistler
            ArrayList<String > typePizza=new ArrayList<>();
            for (Type ty:Type.values()){
                typePizza.add(ty.typeName);
            }

            ArrayList<String> sizePizza=new ArrayList<>();
            for (Size sz:Size.values()){
                sizePizza.add(sz.sizeName);
            }

            ArrayList<String> ingPizza=new ArrayList<>();
            for (Ingredient ing:Ingredient.values()){
                ingPizza.add(ing.ingredientName);
            }

            ArrayList<String > doPizza=new ArrayList<>();
            for (Dough dog:Dough.values()){
                doPizza.add(dog.doughName);
            }

            ArrayList<Double> typePrice=new ArrayList<>();
            for (Type ty:Type.values()){
                typePrice.add(ty.typeAddPrice);
            }

            ArrayList<Double> sizePirceRatio=new ArrayList<>();
            for (Size sz:Size.values()){
                sizePirceRatio.add(sz.sizeAddPriceRatio);
            }

            ArrayList<Double> ingPrice=new ArrayList<>();
            for (Ingredient ing:Ingredient.values()){
                ingPrice.add(ing.ingredientAddPrice);
            }

            ArrayList<Double > doPrice=new ArrayList<>();
            for (Dough dog:Dough.values()){
                doPrice.add(dog.doughAddPrice);
            }

            do {


            Menu.systemMenu();
            systemChoice=scan.nextInt();
            if (systemChoice==1){
                choices.clear();
                extraIngredience.clear();
            }
                if (systemChoice==2){
                    System.out.println();
                    System.out.print(typePizza.get((choices.get(0))-1)+ " ");
                    System.out.print("("+sizePizza.get((choices.get(1))-1)+ ") ");
                    System.out.print(doPizza.get((choices.get(2))-1)+ " ");
                    System.out.println("\nEkstra Ingredience :");
                    for (int i=3;i<choices.size();i++){
                        System.out.print(ingPizza.get((choices.get(i))-1)+ " ");


                    }
                    System.out.print("\nTotal Price :");

                    double extraSum=0;
                    for (int i=3;i<choices.size();i++)
                        extraSum+=ingPrice.get((choices.get(i))-1);

                    double sum= (typePrice.get((choices.get(0))-1)+doPrice.get((choices.get(2))-1)+extraSum)
                            * sizePirceRatio.get((choices.get(1))-1);
                    System.out.print(sum+"TL\n");

                }

                if (systemChoice==3){

                    System.out.println();
                    System.out.print(typePizza.get((choices.get(0))-1)+ " ");
                    System.out.print("("+sizePizza.get((choices.get(1))-1)+ ") ");
                    System.out.print(doPizza.get((choices.get(2))-1)+ " ");
                    System.out.println("\nEkstra Ingredience :");
                    for (int i=3;i<choices.size();i++){
                        System.out.print(ingPizza.get((choices.get(i))-1)+ " ");


                    }
                    System.out.print("\nTotal Price :");

                    double extraSum=0;
                    for (int i=3;i<choices.size();i++)
                        extraSum+=ingPrice.get((choices.get(i))-1);

                    double sum= (typePrice.get((choices.get(0))-1)+doPrice.get((choices.get(2))-1)+extraSum)
                            * sizePirceRatio.get((choices.get(1))-1);
                    System.out.print(sum+"TL\n");
                    System.out.println();
                    System.out.println("Thank you for your order");
                }
            }while(systemChoice!=3);


        }

    }
}
