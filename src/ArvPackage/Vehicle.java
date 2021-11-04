package ArvPackage;


public abstract class Vehicle implements Comparable<Vehicle> {

    int ID;
    private String type;
    private String regNr;
    private String brand;
    private String manufacturingYear;
    private String color;
    private Double price;
    private double salePrice;
    private boolean onSale = false;
    static int idGenerator = 1;

    public Vehicle(String type, String regNr, String brand, String manufacturingYear, String color, double price, double salePrice, boolean onSale) {
        ID = idGenerator++;
        this.type = type;
        this.regNr = regNr;
        this.brand = brand;
        this.color = color;
        this.manufacturingYear = manufacturingYear;
        this.price = price;
        this.salePrice = salePrice;
        this.onSale = onSale;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public boolean onSale() {
        return onSale;
    }

    public void setonSale(boolean onSale) {
        this.onSale = onSale;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public String getRegNr() {
        return regNr;
    }

    public void setManufacturingYear(String manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    public String getManufacturingYear() {
        return manufacturingYear;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        if (onSale == true) {

            return salePrice;

        } else {
            return price;
        }
    }

    public String getPriceString() {
        if (onSale == true) {
            return "Sale ";
        }
        return "";
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public boolean isSalePrice() {
        return onSale;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {

        salePrice = discountStrategy.priceByDiscount(this);

    }

    public String toString() {
        return "Id: " + ID + " | Type: " + type + " | Reg number " + regNr + " | Brand: " + brand + " | Manufacturing year: " + manufacturingYear + " | Color: " + color + " | " + getPriceString() + "Price: " + getPrice();
    }

    @Override
    public int compareTo(Vehicle o) {
        return o.price.compareTo(this.price);
    }
}

