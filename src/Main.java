public class Main {
    public static void main(String[] args) {
        System.out.println("Скорость автомобиля составляет " + Transports.CAR.getSpeed() + " миль в час.");
        System.out.println("Скорость грузовика составляет " + Transports.TRUCK.getSpeed() + " миль в час.");
        System.out.println("Скорость самолета составляет " + Transports.AIRPLANE.getSpeed() + " миль в час.");
        System.out.println("Скорость поезда составляет " + Transports.TRAIN.getSpeed() + " миль в час.");
        System.out.println("Скорость катера составляет " + Transports.BOAT.getSpeed() + " миль в час.");
    }
}
