import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Capitan capitan = new Capitan("Juan", "Pérez", "123456");

        Velero velero = new Velero(capitan, 5000, 200, 2022, 30, 5);
        Yate yate = new Yate(capitan, 10000, 500, 2021, 40, 6, 30);

        Usuario usuario = new Usuario("001", "Ana", "Calle Falsa 123", "555-1234");

        Alquiler alquiler = new Alquiler(velero, usuario, new Date());

        System.out.println("Monto de alquiler del velero: " + velero.calcularMontoAlquiler());
        System.out.println("Monto de alquiler del yate: " + yate.calcularMontoAlquiler());

        double precioCompra = yate.calcularPrecioCompra(12000);
        System.out.println("Precio de compra del yate: " + precioCompra);

        System.out.println("¿El velero es grande?: " + velero.esGrande());
    }
}
