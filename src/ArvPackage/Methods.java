package ArvPackage;

import java.util.ArrayList;
import java.util.Collections;

import static ArvPackage.Utility.*;

public class Methods {
    static ArrayList<Vehicle> Vehicles = new ArrayList<>(100);


    public static void load() {
        Car c1 = new Car("Car","BWO123", "BMW", "2014", "Black", 170000, 0, false);
        Car c2 = new Car("Car","MON137", "Honda", "2003", "Silver", 40000,0,false);
        Car c3 = new Car("Car","URO509", "Peugeot", "2004", "Silver", 8000, 0, false);
        Car c4 = new Car("Car","RED666", "Porsche", "2016", "Red", 800000, 0,false);

        Vehicles.add(c1);
        Vehicles.add(c2);
        Vehicles.add(c3);
        Vehicles.add(c4);

        Van v1 = new Van("Van","EGO624", "Volkswagen", "1970", "Pink", 1000, 0,false,20);
        Van v2 = new Van("Van","Eli337", "Renault", "2014", "White", 18000,0,false, 12);
        Van v3 = new Van("Van","EGA624", "BMW", "1999", "Orange", 5000,0,false, 24);

        Vehicles.add(v1);
        Vehicles.add(v2);
        Vehicles.add(v3);

        Minibus m1 = new Minibus("Minibus","VRO00M", "Volkswagen", "1970", "Green", 30000,0,false, 9);
        Minibus m2 = new Minibus("Minibus","BJK908", "Toyota", "2020", "Beige", 40000,0,false, 7);
        Minibus m3 = new Minibus("Minibus","BOO00M", "BMW", "2001", "Black", 2000000,0,false, 12);

        Vehicles.add(m1);
        Vehicles.add(m2);
        Vehicles.add(m3);
    }

    public static int menu() {
        System.out.println("\nWhat task would you like to do?");
        System.out.println("1. To add a new vehicle ");
        System.out.println("2. To display all vehicles");
        System.out.println("3. To display vehicle by registration number");
        System.out.println("4. To display vehicle by ID");
        System.out.println("5. To update color of a vehicle");
        System.out.println("6. To update price of a vehicle");
        System.out.println("7. To remove a vehicle");
        System.out.println("8. To display the total number of vehicles");
        System.out.println("9. To calculate average price");
        System.out.println("10. To find the cheapest vehicle");
        System.out.println("11. To find the most expensive vehicle");
        System.out.println("12. Activate summer discount");
        System.out.println("13. Sort vehicles by descending price");
        System.out.println("14. Sort vehicles by ascending price");
        System.out.println("0. To quit");
        int choice = readInt();
        return choice;
    }

    public static void addMenu() {
        System.out.println("What type of vehicle would you like to add?\n1. For car\n2. For Van\n3. For Minibus");
        int choice = readInt();
        switch (choice) {
            case 1: {
                createCar();
                break;
            }
            case 2: {
                createVan();
                break;
            }
            case 3: {
                createMinibus();
                break;
            }
        }
    }
    public static void createCar() {
        Car v = new Car("","", "", "", "", 0,0,false);
        v.setType("Car");
        System.out.println("Registration number? ");
        v.setRegNr(readString());
        System.out.println("Brand");
        v.setBrand(readString());
        System.out.println("Manufacturing year?");
        v.setManufacturingYear(readString());
        System.out.println("Color?");
        v.setColor(readString());
        System.out.println("Price?");
        v.setPrice(readDouble());

        Vehicles.add(v);
        System.out.println("Added: " + v);
        pressEnter();
    }

    public static void createVan() {
        Van v = new Van("","", "", "", "",0, 0,false,0);
        v.setType("Van");
        System.out.println("Registration number?");
        v.setRegNr(readString());
        System.out.println("Brand");
        v.setBrand(readString());
        System.out.println("Manufacturing year?");
        v.setManufacturingYear(readString());
        System.out.println("Color?");
        v.setColor(readString());
        System.out.println("Price?");
        v.setPrice(readDouble());
        System.out.println("Capacity?");
        v.setStoreSpace(readInt());
        Vehicles.add(v);
        System.out.println("Added " + v);
        pressEnter();

    }

    public static void createMinibus() {
        Minibus v = new Minibus("","", "", "", "", 0,0,false, 0);
        v.setType("Minibus");
        System.out.println("Registration number?");
        v.setRegNr(readString());
        System.out.println("Brand");
        v.setBrand(readString());
        System.out.println("Manufacturing year?");
        v.setManufacturingYear(readString());
        System.out.println("Color?");
        v.setColor(readString());
        System.out.println("Price?");
        v.setPrice(readDouble());
        System.out.println("Number of seats?");
        v.setSeats(readInt());
        Vehicles.add(v);
        System.out.println("Added " + v);
        pressEnter();
    }

    public static void displayVehicleByReg() {
        System.out.println("What registration number does the vehicle have?");
        String regNr = readString();
        for (Vehicle e : Vehicles) {
            if (e.getRegNr().equalsIgnoreCase(regNr)) {
                System.out.println(e);
            }
        }
        pressEnter();
    }

    public static void displayVehicleByUserID() {
        System.out.println("What ID does the vehicle have?");
        int ID = readInt();
        for (Vehicle e : Vehicles) {
            if (e.getID() == ID) {
                System.out.println(e);
            }
        }
        pressEnter();
    }
    public static void displayVehicleByID(int ID) {
        for (Vehicle e : Vehicles) {
            if (e.getID() == ID) {
                System.out.println(e);
            }
        }
    }

    public static void displayAllVehicles() {
        for (Vehicle e : Vehicles) {
            System.out.println(e);
        }
    pressEnter();
    }

    public static void displayAllVehiclesShort() {
        for (Vehicle e : Vehicles) {
            System.out.println(e.getType() + " | " + e.ID + " | " + e.getRegNr() + " | " + e.getBrand());
        }
    }

public static void createVehicle(Vehicle v){
        //Framtida projekt
    }
    public static void updateColor() {
        displayAllVehiclesShort();
        System.out.println("What is the ID of the Vehicle you want to recolor");
        int ID = readInt();

        System.out.println("New color?");
        String color = readString();
        for (Vehicle e : Vehicles) {
            if (e.getID() == ID) {
                e.setColor(color);
                displayVehicleByID(ID);
                pressEnter();
            }
        }
    }
    public static void updatePrice() {
        displayAllVehiclesShort();
        System.out.println("What is the ID of the Vehicle you want to reprice");
        int ID = readInt();

        System.out.println("New price?");
        Double price = readDouble();
        for (Vehicle e : Vehicles) {
            if (e.getID() == ID) {
                e.setPrice(price);
                displayVehicleByID(ID);
                pressEnter();
            }
        }
    }public static Vehicle findVehicleByID(int ID) {
        for (Vehicle e : Vehicles) {
            if (e.getID() == ID)
                return e;
        }
        return null;
    }

    public static void removeVehicle() {
        displayAllVehiclesShort();
        System.out.println("What is the ID of the vehicles you want to remove? ");
        int id = readInt();
        Vehicle c = findVehicleByID(id);

        System.out.println(findVehicleByID(id) + " is removed");
        Vehicles.remove(c);
        pressEnter();
    }
    public static void vehiclesInList(){
        System.out.println("Amount of vehicles in list: " + Vehicles.size());
        pressEnter();
    }
    public static void calcAveragePrice(){
        double total = 0;
        for (Vehicle e: Vehicles){
            total += e.getPrice();
        }
        System.out.println("The average price of the vehicles in the list is " + (total / Vehicles.size()) + "$$$$");
        pressEnter();
    }
    public static void findCheapestVehicle(){
        double cheapestVehicle = Vehicles.get(0).getPrice();
        int ID = 0;
        String regNr = "";
        String brand = "";
        String type = "";

        for (int i = 1; i < Vehicles.size(); i++){
            if (Vehicles.get(i).getPrice() < cheapestVehicle){
                cheapestVehicle = Vehicles.get(i).getPrice();
                ID = Vehicles.get(i).getID();
                regNr = Vehicles.get(i).getRegNr();
                brand = Vehicles.get(i).getBrand();
                type =  Vehicles.get(i).getType();
            }
        }
        System.out.println("The cheapest vehicle costs: " + cheapestVehicle + " $ | " + type + " | ID: " +  ID +  " | reg nr: " + regNr + " | brand: " + brand);
        pressEnter();
    }
    public static void findMostExpensiveVehicle(){
        double mostExpensive = Vehicles.get(0).getPrice();
        int ID = 0;
        String regNr = "";
        String brand = "";
        String type = "";


        for (int i = 1; i < Vehicles.size(); i++){
            if (Vehicles.get(i).getPrice() > mostExpensive){
                mostExpensive = Vehicles.get(i).getPrice();
                ID = Vehicles.get(i).getID();
                regNr = Vehicles.get(i).getRegNr();
                brand = Vehicles.get(i).getBrand();
                type =  Vehicles.get(i).getType();
            }
        }
        System.out.println("The most expensive vehicle costs: " + mostExpensive + " $ | " + type + " | ID: " +  ID +  " | reg nr: " + regNr + " | brand: " + brand);
        pressEnter();
    }

    public static void activateSummerDiscount() {
        for (Vehicle v: Vehicles) {
            v.setDiscountStrategy(new SummerSale());
        }
    }
    public static void sortByPriceAscending(){
        Vehicles.sort(Vehicle::compareTo);
        displayAllVehicles();
    }
    public static void sortByPriceDescending(){
        Vehicles.sort(Vehicle::compareTo);
        Collections.reverse(Vehicles);
        displayAllVehicles();
    }

  /*  public static void MinibusAndVanSale(){
        for (Vehicle e: Vehicles){
            if (e instanceof Van){
                e.setSalePrice(true);
            }
            if (e instanceof Minibus){
                e.setSalePrice(true);
            }
        }
    } */
}
