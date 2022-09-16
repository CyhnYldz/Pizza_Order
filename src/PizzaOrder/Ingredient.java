package PizzaOrder;

public enum Ingredient {
    PEPPERONI(1,"Extra Pepperoni",10),
    HAM(2,"Extra Ham",10),
    MUSHROOM(3,"Extra Mushroom",5),
    BACON(4,"Extra Bacon",10),
    CHILI_PEPPER(5,"Extra Chili Pepper",5),
    ONION(6,"Extra Onion",5),
    OLIVE(7,"Extra Olive",5),
    CORN(8,"Extra Corn",5),
    NON(9,"No Extra",0);
    String ingredientName;
    double ingredientAddPrice;
    int no;

    Ingredient(int no,String ingredientName, double ingredientAddPrice) {
        this.ingredientName = ingredientName;
        this.ingredientAddPrice = ingredientAddPrice;
    }
}
