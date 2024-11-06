package veiculoherencia;

import java.util.ArrayList;
import java.util.List;

public class Race {
    //Attributes
    private List<Vehiculo> peloton;

    // Constructors
    public Race(List<Vehiculo> peloton) {
        this.peloton = peloton;
    }

    public Race() {
        peloton = new ArrayList<>();

        peloton.add(new Car("Toyota"));
        peloton.add(new Car("Honda"));
        peloton.add(new Moto("Yamaha"));
        peloton.add(new Moto("Suzuki"));
    }

 // Methods
    public void start() {
        System.out.println("Empezamos carrera");
        for (Vehiculo vehiculo : peloton) {
            vehiculo.acelerar();
            System.out.println(vehiculo.getMarca() + " tiene velocidad: " + vehiculo.getVelocity());
        }
    }

}
