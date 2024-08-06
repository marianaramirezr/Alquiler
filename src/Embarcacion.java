public abstract class Embarcacion {
    private Capitan capitan;
    private double precioBase;
    private double valorAdicional;
    private int anioFabricacion;
    private double eslora;

    public Embarcacion(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, double eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
    }

    public double calcularMontoAlquiler() {
        double monto = precioBase;
        if (anioFabricacion > 2020) {
            monto += 20000;
        }
        return monto;
    }

    public Capitan getCapitan() { return capitan; }
    public double getPrecioBase() { return precioBase; }
    public double getValorAdicional() { return valorAdicional; }
    public int getAnioFabricacion() { return anioFabricacion; }
    public double getEslora() { return eslora; }
}
