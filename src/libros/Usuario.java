package libros;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    // Atributos
    private String nombre;
    private List<Libro> libroUsuario;

    // Constructor
    public Usuario(String nombre) {
        this.nombre = nombre;
        this.libroUsuario = new ArrayList<Libro>();
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibroPrestadosUsuario() {
        return libroUsuario;
    }

    public void setLibroPrestadoUsuario(List<Libro> libroUsuario) {
        this.libroUsuario = libroUsuario;
    }

    public boolean asignarLibro(Libro libroAprestar) {
        if (libroAprestar.prestarLibro()) {
            this.libroUsuario.add(libroAprestar);
            System.out.println("El libro " + libroAprestar.getTitulo() + " se ha prestado a " + this.getNombre());
            return true;
        } else {
            System.out.println("El libro " + libroAprestar.getTitulo() + " no está disponible.");
            return false;
        }

    }

    public boolean devolverLibro(Libro libroAdevolver) {
        if (libroUsuario.contains(libroAdevolver)) {
            libroUsuario.remove(libroAdevolver);
            libroAdevolver.setPrestado(false);
            System.out.println("El libro " + libroAdevolver.getTitulo() + " ha sido devuelto por " + this.nombre);
            return true;
        } else {
            System.out.println("El usuario " + this.nombre + " no tiene el libro a devolver: " + libroAdevolver.getTitulo() );
            return false;

        }

    }

    public void listarLibrosUsuario() {

        System.out.println("El usuario " + this.nombre + " tiene prestados los siguientes libros: ");
        System.out.print("[ ");
        for (Libro libro : libroUsuario) {
            System.out.println(libro.getTitulo() + " ");

        }
        System.out.println("]");
    }

    @Override
    public boolean equals(Object obj) {
        return this.nombre.equals(((Usuario) obj).nombre);
    }
}
