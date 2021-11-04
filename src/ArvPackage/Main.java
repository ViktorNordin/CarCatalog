package ArvPackage;

import static ArvPackage.Methods.*;
import static ArvPackage.SummerSale.*;

public class Main {
    public static void main(String[] args) {
        load();
       // MinibusAndVanSale();

        boolean loop = true;
        while (loop) {

            // priceByDiscount();
            int task = menu();
            switch (task) {
                case 1:
                    addMenu();
                    break;
                case 2:
                    displayAllVehicles();
                    break;
                case 3:
                    displayVehicleByReg();
                    break;
                case 4:
                    displayVehicleByUserID();
                    break;
                case 5:
                    updateColor();
                    break;
                case 6:
                    updatePrice();
                    break;
                case 7:
                    removeVehicle();
                    break;
                case 8:
                    vehiclesInList();
                    break;
                case 9:
                    calcAveragePrice();
                    break;
                case 10:
                    findCheapestVehicle();
                    break;
                case 11:
                    findMostExpensiveVehicle();
                    break;
                case 12:
                    activateSummerDiscount();
                    break;
                case 13:
                    sortByPriceAscending();
                    break;
                case 14:
                    sortByPriceDescending();
                    break;
                case 0:
                    loop = false;
                    break;
            }
        }
    }
}

