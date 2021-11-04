package ArvPackage;

import static ArvPackage.Methods.*;
import static ArvPackage.Vehicle.*;

public class SummerSale implements DiscountStrategy {

    @Override
    public double priceByDiscount(Vehicle saleVehicle) {
        double price = saleVehicle.getPrice();

        if (saleVehicle instanceof Van) {
            price = 0.7 * price;
            saleVehicle.setonSale(true);
        }
        if (saleVehicle instanceof Minibus) {
            price = 0.5 * price;
            saleVehicle.setonSale(true);
        }
        return price;
    }
}




