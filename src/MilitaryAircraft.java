public class MilitaryAircraft extends AirTransport{
    private int numberOfMissiles;
    private boolean catapultAvailability;

    public MilitaryAircraft(int power, int maxSpeed, int weight, String brand, float wingspan, int minLengthOfRunway, int numberOfMissiles, boolean catapultAvailability) {
        super(power, maxSpeed, weight, brand, wingspan, minLengthOfRunway);
        this.numberOfMissiles = numberOfMissiles;
        this.catapultAvailability = catapultAvailability;
    }
    public void showInfo(){
        super.showInfo();
        System.out.println("Количество ракет на борту: "+this.numberOfMissiles+"шт.\n" +
                "Наличие системы катапультирования: "+this.catapultAvailability);
    }

    public int getNumberOfMissiles() {
        return numberOfMissiles;
    }

    public boolean isCatapultAvailability() {
        return catapultAvailability;
    }
    public void shot(){
        if ( getNumberOfMissiles() != 0){
            System.out.println("Ракета пошла!");
        } else {
            System.out.println("Боеприпасы отсутствуют!");
        }
    }
    public void catapultCheck(){
        if (isCatapultAvailability() == true){
            System.out.println("Катапультирование прошло успешно!");
        } else {
            System.out.println("У вас нет такой системы!");
        }
    }
}
