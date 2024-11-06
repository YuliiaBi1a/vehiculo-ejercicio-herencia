package veiculoherencia;

public abstract class Vehiculo {
    //Attributes
    private String marca;
    protected int velocity;
    protected int ruedas;

    //Constructor
    public Vehiculo(String marca, int ruedas) {
        this.marca = marca;
        this.velocity = 0;
        this.ruedas = ruedas;
    }
    //Getters
    public int getVelocity() {
        return velocity;
    }
    public String getMarca() {
        return marca;
    }
    // Methods
    public abstract void acelerar();
    public abstract void frenar();

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", velocity=" + velocity +
                ", ruedas=" + ruedas +
                '}';
    }
}





