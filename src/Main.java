public class Main {

    public static void main(String args[]){

        NormalVehicle normalVehicle = new NormalVehicle(1922, "gas",
                320, 50);
        System.out.println("Info of a New Normal Vehicle: "+ normalVehicle.addVehicle(
                                normalVehicle.model_number,normalVehicle.engine_type,
                                normalVehicle.engine_power, normalVehicle.tire_size));

    }
}
