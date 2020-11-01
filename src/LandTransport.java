public class LandTransport extends Transport {
    private int numberOfWheels;
    private double fuelConsumption;

    public LandTransport(int horsePower, int maxSpeed, int weight, String brand, int numberOfWheels, double fuelConsumption) {
        super(horsePower, maxSpeed, weight, brand);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }
    public void showInfo(){
        super.showInfo();
        System.out.println("Количество колес: "+this.numberOfWheels+"\n" +
                "Расход топлива: "+this.fuelConsumption+" л/100 км.");
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }
}
