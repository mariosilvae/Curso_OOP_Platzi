class Main{
    public static void main(String[] args) {
        System.out.println("Hola Mundo");

        Car car = new Car("AMQ123", new Account("Andres Herrera", "AND123") );
        car.passenger = 4;
        car.printDataCar();

        Car car2 = new Car("AMQ456", new Account("Andrea Herrera", "AMD456") );
        car2.passenger = 4;
        car2.printDataCar();
    }
}