package libros;

public class Libro {

    protected boolean alquilado;//Esto deberia estar en alquilable
    protected String editorial;
    protected String titulo;

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
