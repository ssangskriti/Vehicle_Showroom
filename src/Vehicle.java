abstract class Vehicle {

    protected int model_number;
    protected int engine_power;
    protected int tire_size;
    protected String engine_type;

    Vehicle(int model_number, String engine_type, int engine_power, int tire_size ){

        this.model_number = model_number;
        this.engine_type = engine_type;
        this.engine_power = engine_power;
        this.tire_size = tire_size;
    }

    abstract void addVehicle(int model_number, String engine_type, int engine_power, int tire_size);

    abstract void removeVehicle(int model_number);

    abstract void showVehicleList();

    abstract void showVisitorCount();

}
