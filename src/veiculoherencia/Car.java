package veiculoherencia;

class Car extends Vehiculo {
   //Constructor(usamos de class super)
   public Car(String marca) {
       super(marca, 4);
   }

    @Override
    public void acelerar() {
        velocity += 20;
    }

    @Override
    public void frenar() {
        velocity -= 20;
        if (velocity < 0) velocity = 0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "velocity=" + velocity +
                ", ruedas=" + ruedas +
                ", marca='" + super.getMarca() + '\'' +
                '}';
    }
}
