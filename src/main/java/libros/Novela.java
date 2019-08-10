package libros;

import Interface.Alquilable;

public class Novela extends Libro implements Alquilable {

    private String autor = "";

    private String edicion = "";

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    @Override
    public void alquilar() {

    }

    @Override
    public void devolver() {

    }
}
