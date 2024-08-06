public class Velero extends Embarcacion {
    private int cantidadMastiles;

    public Velero(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, double eslora, int cantidadMastiles) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }

    @Override
    public double calcularMontoAlquiler() {
        double monto = super.calcularMontoAlquiler();
        if (cantidadMastiles > 4) {
            monto *= 1.10; // Costo adicional del 10%
        }
        return monto;
    }

    public boolean esGrande() {
        return cantidadMastiles > 4;
    }

    public int getCantidadMastiles() { return cantidadMastiles; }
}
