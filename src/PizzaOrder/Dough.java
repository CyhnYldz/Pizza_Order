package PizzaOrder;

public enum Dough {
    STANDART(1,"Standart Crust",0),
    THICK(2,"Thick Crust",5),
    THIN(3,"Thin Crust",5),
    PARMESAN(4,"Crust with Parmesan",10),
    BUTTER(5,"Crust with Butter",7.5);
    String doughName;
    double doughAddPrice;
    int no;

    Dough(int no,String doughName, double doughAddPrice) {
        this.doughName = doughName;
        this.doughAddPrice = doughAddPrice;
    }
}
