package ArvPackage;

public class Van extends Vehicle {

    int storeSpace;

    public Van(String type, String regNr, String brand, String manufacturingYear, String color, double price,double salePrice, boolean onSale, int storeSpace) {
        super(type, regNr, brand, manufacturingYear, color, price, salePrice, onSale);
        this.storeSpace = storeSpace;
    }

    public void setStoreSpace(int storeSpace) {
        this.storeSpace = storeSpace;
    }

    public int getStoreSpace() {
        return storeSpace;
    }

    @Override
    public String toString() {
        return super.toString() + " | capacity: " + storeSpace;
    }
}


