import java.util.Scanner;

public class PassengerAircraft extends AirTransport {
    private int numberOfPassengers;
    private boolean businessClassAvailability;

    public PassengerAircraft(int power, int maxSpeed, int weight, String brand, float wingspan, int minLengthOfRunway, int numberOfPassengers, boolean businessClassAvailability) {
        super(power, maxSpeed, weight, brand, wingspan, minLengthOfRunway);
        this.numberOfPassengers = numberOfPassengers;
        this.businessClassAvailability = businessClassAvailability;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Количество пассажиров: "+this.numberOfPassengers + "\n" +
                "Наличие бизнес - класса: " + this.businessClassAvailability);
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void passengerCheck() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество пассажиров: ");
        int userAmount = in.nextInt();
        if (getNumberOfPassengers() < userAmount) {
            System.out.println("Вам нужен самолет побольше!");
        } else {
            System.out.println("Самолет загружен!");
        }
    }
}


