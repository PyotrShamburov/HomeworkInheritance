public class Transport {
    private int horsePower;
    private int maxSpeed;
    private int weight;
    private String brand;

    public Transport(int horsePower, int maxSpeed, int weight, String brand) {
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public float horseToKilowatt(int horsePower){
        float kilowattPower = horsePower*0.74f;
        return kilowattPower;
    }

    public void showInfo(){
        System.out.println("Название: "+this.brand+"\n" +
                "Максимальная скорость: "+this.maxSpeed+" км/ч.\n" +
                "Масса: "+this.weight+"(т). \n" +
                "Мощность в л.с.:  "+this.horsePower+"\n" +
                "Мощность в киловаттах:  "+horseToKilowatt(horsePower));
    }
}
