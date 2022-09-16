package PizzaOrder;

public enum Type {

    MARGARITA(1,"Margarita Pizza",50),
    PEPPERONI(2,"Pepperoni Pizza",60),
    HAWAIIAN(3,"Hawaiian Pizza",65),
    SEAFOOD(4,"SeaFood Pizza",65),
    MEXICAN(5,"Mexican Pizza",60),
    VEGETABLE(6,"Vegetable Pizza",60),
    ITALIAN(7,"Italian Pizza",55),
    PEPPER_AND_HAM(8,"Pepper & Ham Pizza",70),
    KEBAB(9,"Kebab Pizza",80);
    String typeName;
    double typeAddPrice;
    int no;

    Type(int no,String typeName, double typeAddPrice) {
        this.typeName = typeName;
        this.typeAddPrice = typeAddPrice;
    }
}
