public class Yate extends Embarcacion {
    private int cantidadCamarotes;
    private int vecesAlquilado;

    public Yate(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, double eslora, int cantidadCamarotes, int vecesAlquilado) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
        this.vecesAlquilado = vecesAlquilado;
    }

    public double calcularPrecioCompra(double precioInicial) {
        double precioCompra = precioInicial;

        if (vecesAlquilado > 50) {
            if (cantidadCamarotes > 8) {
                precioCompra *= 0.95; // Reducción del 5%
            } else if (cantidadCamarotes > 5) {
                precioCompra *= 0.90; // Reducción del 10%
            } else {
                precioCompra *= 0.80; // Reducción del 20%
            }
        } else if (vecesAlquilado > 20) {
            precioCompra *= 0.90; // Reducción del 10%
        }

        return precioCompra;
    }

    public int getCantidadCamarotes() { return cantidadCamarotes; }
    public int getVecesAlquilado() { return vecesAlquilado; }
}
