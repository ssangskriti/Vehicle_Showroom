public class NormalVehicle extends Vehicle {

    NormalVehicle(int model_number, String engine_type, int engine_power, int tire_size){
        super( "Normal", model_number,  engine_type,  engine_power,  tire_size);
    }


    @Override
    void addVehicle(Vehicle v){

        Vehicle.vehicleList.add(v);
    }

}
