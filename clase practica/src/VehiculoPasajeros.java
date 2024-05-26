// VehiculoPasajeros.java
public class VehiculoPasajeros extends vehiculo {
    private int numPasajeros;

    // Constructor
    public VehiculoPasajeros(String marca, String modelo, int año, int kilometraje, int numPasajeros) {
        super(modelo, modelo, numPasajeros, numPasajeros);
        this.numPasajeros = numPasajeros;
    }

    // Getter y Setter para numPasajeros
    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    // Sobrescribir el método mostrarInfo()
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de Pasajeros: " + numPasajeros);
    }
}

