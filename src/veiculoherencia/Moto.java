package veiculoherencia;

class Moto extends Vehiculo {
    //Constructor(usamos de class super)
    public Moto(String marca) {
        super(marca, 2);
    }

    @Override
    public void acelerar() {
        velocity += 30;
    }

    @Override
    public void frenar() {
        velocity -= 10;
        if (velocity < 0) velocity = 0;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "velocity=" + velocity +
                ", ruedas=" + ruedas +
                ", marca='" + super.getMarca() + '\'' +
                '}';
    }
}