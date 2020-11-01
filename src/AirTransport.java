public class AirTransport extends Transport{
    private float wingspan;
    private int minLengthOfRunway;

    public AirTransport(int power, int maxSpeed, int weight, String brand, float wingspan, int minLengthOfRunway) {
        super(power, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minLengthOfRunway = minLengthOfRunway;
    }
    public void showInfo(){
        super.showInfo();
        System.out.println("Размах крыла: "+this.wingspan+" м.\n" +
                "Минимальая длина ВПП для взлета: "+this.minLengthOfRunway+" м.");
    }
}
