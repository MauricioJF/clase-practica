// VehiculoCarga.java
public class VehiculoCarga extends vehiculo {
    private int capacidadCarga;

    // Constructor
    public VehiculoCarga(String marca, String modelo, int año, int kilometraje, int capacidadCarga) {
        super(marca, modelo, año, kilometraje);
        this.capacidadCarga = capacidadCarga;
    }

    // Getter y Setter para capacidadCarga
    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    // Sobrescribir el método mostrarInfo()
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Capacidad de Carga: " + capacidadCarga + "kg");
    }
}