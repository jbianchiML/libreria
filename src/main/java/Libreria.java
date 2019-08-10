import Interface.Alquilable;
import libros.Libro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Libreria {

    private List<Alquiler> alquileres = new ArrayList<Alquiler>();
    private List<Libro> libros = new ArrayList<Libro>();
    private Libreria(){

    }

    private static Libreria libreriaUnica=  new Libreria();

    public Libreria getInstance (){
        return libreriaUnica;
    }

    public Alquiler buscarAlquiler (Alquilable alquilable) {
        Predicate<Alquiler> alquilerPredicate = x -> x.getAlquilable().equals(alquilable);
        return (Alquiler) this.alquileres.stream().filter(alquilerPredicate);
    }

    public void agregarAlquiler(Alquilable alquilable) {
        Alquiler alquiler = new Alquiler(alquilable);
        this.alquileres.add(alquiler);
    }

    public void listarAlquileres (){
        this.alquileres.stream().forEach(x->{
            Libro libro = (Libro) x.getAlquilable();
            System.out.println(libro.getTitulo());
            System.out.println(x.getFecha_alquiler());

        });
    }

    public void devolverAlquiler (Alquiler alquiler) {
        boolean existeAlquiler = alquileres.stream().filter(x -> x.equals(alquiler)).collect(Collectors.toList()).isEmpty();
        if (existeAlquiler) {
            Alquiler alquilerEnLista = alquileres.stream().filter(x -> x.equals(alquiler)).collect(Collectors.toList()).get(0);
            alquilerEnLista.devolverAlquiler();

        }
    }

    public void alquilar(Alquiler alquiler) {



    }


}
