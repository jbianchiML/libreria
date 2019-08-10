import Interface.Alquilable;

import java.time.LocalDateTime;
import java.util.Date;

public class Alquiler {

    private Alquilable alquilable;
    private LocalDateTime fecha_devolucion;
    private LocalDateTime fecha_alquiler;

    public Alquiler(Alquilable alquilable){
        this.alquilable = alquilable;
        this.fecha_alquiler = LocalDateTime.now();
    }

    public void setFecha_devolucion(LocalDateTime fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }


    public LocalDateTime getFecha_devolucion() {

        return fecha_devolucion;
    }

    public LocalDateTime getFecha_alquiler() {

        return fecha_alquiler;
    }

    public void setFecha_alquiler(LocalDateTime fecha_alquiler) {

        this.fecha_alquiler = fecha_alquiler;
    }


    public Alquilable getAlquilable() {
        return alquilable;
    }

    public void setAlquilable(Alquilable alquilable) {
        this.alquilable = alquilable;
    }

    public void devolverAlquiler(){
        this.fecha_devolucion = LocalDateTime.now();
        this.alquilable.devolver();
    }

}
