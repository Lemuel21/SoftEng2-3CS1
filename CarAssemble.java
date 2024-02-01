public class CarAssemble{
    /**
     * @param args
     */
    public static void main(String[] args){
        Car car1 = new Car.CarBuilder()
        .engineType("Gas")
        .transmission("Automatic")
        .Color("Blue")
        .passengerCapacity(4)
        .brand("Toyota")
        .build();
        System.out.println(car1.brand);
        System.out.println(car1.engineType);
        System.out.println(car1.Color);
        System.out.println(car1.transmission);
        System.out.println(car1.passengerCapacity);




    }
}