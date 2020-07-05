public class NormalVehicle extends Vehicle {

    NormalVehicle(int model_number, String engine_type, int engine_power, int tire_size){
        super( model_number,  engine_type,  engine_power,  tire_size);
    }

    void addVehicle(int model_number, String engine_type, int engine_power, int tire_size){
        System.out.println("Added new vehicle with:\n"+
                "Model Number:"+ model_number+"\n"+
                "Engine Type: "+ engine_type +"\n"+
                "Engine Power:  "+ engine_power+"\n"+
                "Tire Size: "+tire_size);
    }
}
