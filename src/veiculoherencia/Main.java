package veiculoherencia;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Vehiculo car = new Car("BMW");
//        Vehiculo moto = new Moto("Yamaha");
//
//        System.out.println(car);
//        System.out.println(moto);
//
//        car.acelerar();
//        System.out.println("Car velocity: " + car.getVelocity());
//
//        moto.acelerar();
//        System.out.println("Moto velocity: " + moto.getVelocity());
//
//        car.frenar();
//        System.out.println("Car velocity after braking: " + car.getVelocity());
//
//        moto.frenar();
//        System.out.println("Moto velocity after braking: " + moto.getVelocity());

        // Test race

        //Con constructor por defecto
        Race race = new Race();
        race.start();

        //Con constructor con parámetro
        List <Vehiculo> race1 = new ArrayList<>();

        race1.add(new Car("BMW"));
        race1.add(new Moto("Yamaha"));
        race1.add(new Moto("Suzuki"));

        Race raceF1 = new Race(race1);
        raceF1.start();

    }
}