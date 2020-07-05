public class HeavyVehicle extends Vehicle {

    int weight;
    HeavyVehicle(int model_number, int engine_power, int tire_size, int weight)
    {
            super( "Heavy",  model_number,  "diesel",  engine_power,  tire_size);
            this.weight = weight;
    }

    @Override
    void addVehicle (Vehicle v){

        Vehicle.vehicleList.add(v);

    }
}
