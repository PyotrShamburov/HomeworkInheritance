import java.util.Scanner;

public class Car extends LandTransport {
    private String typeOfBody;
    private int numberOfPassengers;

    public Car(int horsePower, int maxSpeed, int weight, String brand, int numberOfWheels, double fuelConsumption, String typeOfBody, int numberOfPassengers) {
        super(horsePower, maxSpeed, weight, brand, numberOfWheels, fuelConsumption);
        this.typeOfBody = typeOfBody;
        this.numberOfPassengers = numberOfPassengers;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Тип кузова: "+this.typeOfBody + "\n" +
                "Количество пассажиров: " + this.numberOfPassengers);
    }
    private void distanceOnMaxSpeed() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите время поездки: ");
        double time = in.nextDouble();
        double distance;
        if (time < 1) {
            System.out.println("Wrong time data!");
            distance = 0;
        } else {
            distance = getMaxSpeed() * time;
            double fuel = (distance / 100) * getFuelConsumption();
            System.out.print("За время "+time+" ч, автомобиль "+getBrand()+ "\n" +
                    "двигаясь с максимальной скоростью "+getMaxSpeed()+ " км/ч, \n" +
                    "проедет "+distance+ " км. и израсходует "+fuel+" л. топлива.");
        }
    }
    public void getAmountOfFuel(){
        distanceOnMaxSpeed();
    }
}
