import java.util.Date;

public class Alquiler {
    private Embarcacion embarcacion;
    private Usuario usuario;
    private Date fechaAlquiler;
    private Date fechaDevolucion;

    public Alquiler(Embarcacion embarcacion, Usuario usuario, Date fechaAlquiler) {
        this.embarcacion = embarcacion;
        this.usuario = usuario;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = null;
    }

    public void devolver(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public boolean estaAlquilado() {
        return fechaDevolucion == null;
    }
    public Embarcacion getEmbarcacion() { return embarcacion; }
    public Usuario getUsuario() { return usuario; }
    public Date getFechaAlquiler() { return fechaAlquiler; }
    public Date getFechaDevolucion() { return fechaDevolucion; }
}

