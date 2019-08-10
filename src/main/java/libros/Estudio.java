package libros;

import Interface.Alquilable;

public class Estudio extends Libro implements Alquilable {

    private String temaDeEstudio;

    public String getTemaDeEstudio() {
        return temaDeEstudio;
    }

    public void setTemaDeEstudio(String temaDeEstudio) {
        this.temaDeEstudio = temaDeEstudio;
    }

    @Override
    public void alquilar() {
        this.alquilado=true;
    }

    @Override
    public void devolver() {
        this.alquilado=false;

    }
}
