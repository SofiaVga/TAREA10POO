package ejemplo2;

public class DriverVehiculo {
    public static void main(String[] args) {
        Camion camion = new Camion("Diesel", 3);
        System.out.println(".....CAMION.....");
        System.out.println(camion);
        System.out.println(camion.encender());
        camion.avanzar();
        camion.frenar();
        System.out.println(camion.apagar());
        System.out.println("....MOTOCICLETA....");
        Motocicleta moto = new Motocicleta( 150, "YAMAHA");
        System.out.println(moto);
        moto.encender();
        moto.avanzar();
        moto.frenar();
        moto.apagar();
    }
}
