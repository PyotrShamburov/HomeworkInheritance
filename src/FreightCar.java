import java.util.Scanner;

public class FreightCar extends LandTransport {
    private int liftingCapacity;

    public FreightCar(int horsePower, int maxSpeed, int weight, String brand, int numberOfWheels, double fuelConsumption, int liftingCapacity) {
        super(horsePower, maxSpeed, weight, brand, numberOfWheels, fuelConsumption);
        this.liftingCapacity = liftingCapacity;
    }
    public void showInfo() {
        super.showInfo();
        System.out.println("Грузоподъемность"+this.liftingCapacity+"(т)");
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public void cargoCheck(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество груза: ");
        double userCargo = in.nextDouble();
        if ( getLiftingCapacity() < userCargo ){
            System.out.println("Вам нужен грузовик побольше!");
        } else {
            System.out.println("Грузовик загружен!");
        }
    }
}
