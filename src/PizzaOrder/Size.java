package PizzaOrder;

public enum Size {
    SLICE(1,"Slice",0.3),
    SMALL(2,"Small",1),
    MEDIUM(3,"Medium",1.25),
    LARGE(4,"Large",1.5);

    String sizeName;
    double sizeAddPriceRatio;
    int no;

    Size(int no,String sizeName, double sizeAddPrice) {
        this.sizeName = sizeName;
        this.sizeAddPriceRatio = sizeAddPrice;
    }
}
