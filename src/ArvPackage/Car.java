package ArvPackage;

public class Car extends Vehicle {

    public Car(String type, String regNr, String brand, String manufacturingYear, String color, double price, double salePrice, boolean onSale) {
        super(type, regNr, brand, manufacturingYear, color, price, salePrice, onSale);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
