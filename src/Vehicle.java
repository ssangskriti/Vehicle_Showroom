import java.util.ArrayList;


abstract class Vehicle {

     String type;
     int model_number;
     int engine_power;
     int tire_size;
     String engine_type;

    static ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
    static int visitorCounter = 30;

    Vehicle(String type, int model_number, String engine_type, int engine_power, int tire_size ){

        this.type = type;
        this.model_number = model_number;
        this.engine_type = engine_type;
        this.engine_power = engine_power;
        this.tire_size = tire_size;

        if(engine_type=="Sports")
            visitorCounter += 20;
    }

    abstract void addVehicle(Vehicle v);

    static void removeVehicle(int model_number){
        for(Vehicle v: vehicleList)
            if(v.model_number==model_number){
                vehicleList.remove(v);
                break;
            }
    }

    static void showVehicleList(){
        System.out.println("Current list of vehicle in the showroom: ");
        for(Vehicle v: vehicleList)
            System.out.println(v.model_number+" "+v.engine_type+" "+v.engine_power+" "+v.type+"\n");
    }

    static void showVisitorCount(){
        System.out.println("Current expected visitors: "+ visitorCounter);
    }

}
