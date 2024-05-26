import vehiculo.Vehiculo;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, world!");
        // Crear instancias de cada tipo de vehículo
        vehiculo auto = new vehiculo("Toyota", "Corolla", 2020, 15000, 5, "Gasolina");
        Camion camion = new Camion("Volvo", "FH", 2019, 75000, 20000, 4);
        // Mostrar la información de cada vehículo
        System.out.println("Información del Auto:");
        auto.mostrarInfo();
        System.out.println("\nInformación del Camion:");
        camion.mostrarInfo();
    }
}