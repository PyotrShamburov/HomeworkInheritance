public class Main {
    public static void main(String[] args) {
        MilitaryAircraft fighter = new MilitaryAircraft(3000,2000,30,"Boeing",40.4f,1000,3,false);
        fighter.showInfo();
        fighter.shot();
        fighter.catapultCheck();

        Car car = new Car(150,210,2,"BMW",4,5.5,"Sedan",4);
        car.showInfo();
        car.getAmountOfFuel();


        FreightCar truck = new FreightCar(300,100,15,"MAN",8,20.5,20);
        truck.showInfo();
        truck.cargoCheck();


        PassengerAircraft erj = new PassengerAircraft(4000,800,35,"ERJ",29.4f,1350,70,true);
        erj.showInfo();
        erj.passengerCheck();





    }
}
