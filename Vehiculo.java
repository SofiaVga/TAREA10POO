package ejemplo2;

public interface Vehiculo {
    public static final int VELOCIDAD_MAX= 160;
    public static final char CLASIFICACIO_EFICIENCIA = 'A';
    public boolean encender ();
    public boolean apagar ();
    public void avanzar ();
    public void frenar ();
}
