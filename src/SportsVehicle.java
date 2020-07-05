public class SportsVehicle extends Vehicle {

    boolean turbo ;

    SportsVehicle(int model_number,  int engine_power, int tire_size, boolean turbo){

        super("Sports", model_number, "oil",engine_power,tire_size);
        this.turbo = turbo;
    }

    @Override
    void addVehicle (Vehicle v){

        Vehicle.vehicleList.add(v);

    }
}
