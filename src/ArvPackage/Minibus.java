package ArvPackage;

public class Minibus extends Vehicle {


    private int seats;

    public Minibus(String type, String regNr, String brand, String manufacturingYear, String color, double price,double salePrice, boolean onSale, int seats) {
        super(type, regNr, brand, manufacturingYear, color, price, salePrice, onSale);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return super.toString() + " | seats: " + seats;
    }
}

