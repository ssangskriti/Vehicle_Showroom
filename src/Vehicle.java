import java.util.ArrayList;


abstract class Vehicle {

     String type;
     int model_number;
     int engine_power;
     int tire_size;
     String engine_type;

    static ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
    static int visitorCounter = 0;

    Vehicle(String type, int model_number, String engine_type, int engine_power, int tire_size ){

        this.type = type;
        this.model_number = model_number;
        this.engine_type = engine_type;
        this.engine_power = engine_power;
        this.tire_size = tire_size;

        visitorCounter = 30;
        if(this.type.equals("Sports"))
            visitorCounter += 20;
    }

    abstract void addVehicle(Vehicle v);

    static void removeVehicle(int model_number){
        if(!vehicleList.isEmpty()) {
            for (Vehicle v : vehicleList)
                if (v.model_number == model_number) {
                    vehicleList.remove(v);
                    System.out.println("Vehicle Removed!");
                    break;
                }
        }
        else System.out.println("No Vehicles in the list!");
    }

    static void showVehicleList(){
        if(!vehicleList.isEmpty()){
            System.out.println("Current list of vehicle in the showroom: ");
            System.out.println("\nModel Number \t Engine type \t Engine Power \t Vehicle type\n");
            for(Vehicle v: vehicleList)
                System.out.println(v.model_number+"\t\t"+v.engine_type+"\t\t"+v.engine_power+"\t\t"+v.type);
        }
        else System.out.println("Sorry, no vehicles to show.");
    }

    static void showVisitorCount(){
        if(!vehicleList.isEmpty())
        System.out.println("Current expected visitors: "+ visitorCounter);
        else
        {
            System.out.println("No visitors!");
            visitorCounter = 0;
        }
    }

}
