public class HeavyVehicle extends Vehicle {

    void addVehicle (int model_number, String engine_type, int engine_power, int tire_size, int weight){
        System.out.println("Added new vehicle with:\n"+
                "Model Number:"+ model_number+"\n"+
                "Engine Type: "+ engine_type +"\n"+
                "Engine Power:  "+ engine_power+"\n"+
                "Tire Size: "+tire_size+"\n",
                "Weight: "+ weight);

    }
}
