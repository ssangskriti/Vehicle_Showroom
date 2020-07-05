import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        int [] num = {1,2,3,4,5,6,7,8,9,10};
        Scanner command = new Scanner(System.in);
        for (int i: num
             ) {


            System.out.println("Vehicle queries (type query number): \n Add - 1 \n Remove - 2 \n " +
                    "Show Vehicle List - 3 \n Show Visitor Count - 4");
            int query = command.nextInt();

            if (query == 4) {
                Vehicle.showVisitorCount();
            } else if (query == 3) {
                Vehicle.showVehicleList();
            } else if (query == 2) {
                if(!Vehicle.vehicleList.isEmpty())
                    query = command.nextInt();
                else query = 0;
                Vehicle.removeVehicle(query);
            } else {
                System.out.println("Which type : \n Normal - 1\n Sports - 2\n Heavy - 3\n");
                query = command.nextInt();
                if (query == 1) {
                    System.out.println("Model Number: ");
                    int model_number = command.nextInt();
                    System.out.println("\n Engine Type: ");
                    String engine_type = command.next();
                    System.out.println("\n Engine Power: ");
                    int engine_power = command.nextInt();
                    System.out.println("\n Tire Size: ");
                    int tire_size = command.nextInt();
                    NormalVehicle vehicle = new NormalVehicle(model_number, engine_type,
                            engine_power, tire_size);

                    vehicle.addVehicle(vehicle);
                } else if (query == 2) {
                    System.out.println("Model Number: ");
                    int model_number = command.nextInt();
                    System.out.println("\n Engine Power: ");
                    int engine_power = command.nextInt();
                    System.out.println("\n Tire Size: ");
                    int tire_size = command.nextInt();
                    System.out.println("\n Turbo: yes or no");
                    String inturbo = command.next();
                    boolean turbo;
                    if(inturbo=="yes")  turbo = true;
                    else  turbo = false;

                    SportsVehicle vehicle = new SportsVehicle(model_number, engine_power,
                            tire_size, turbo);
                    vehicle.addVehicle(vehicle);

                } else if (query == 3) {

                    System.out.println("Model Number: ");
                    int model_number = command.nextInt();
                    System.out.println("\n Engine Power: ");
                    int engine_power = command.nextInt();
                    System.out.println("\n Tire Size: ");
                    int tire_size = command.nextInt();
                    System.out.println("\n Weight: ");
                    int weight = command.nextInt();

                    HeavyVehicle vehicle = new HeavyVehicle(model_number, engine_power, tire_size, weight);
                    vehicle.addVehicle(vehicle);

                }
                System.out.println("Vehicle Added!\n");
            }
        }
    }
}
