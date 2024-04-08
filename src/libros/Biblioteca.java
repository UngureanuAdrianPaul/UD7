package libros;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    // Atributos
    List<Usuario> usuarioBib;
    List<Libro> librosBib;

    // Constructor
    public Biblioteca() {
        this.usuarioBib = new ArrayList<Usuario>();
        this.librosBib = new ArrayList<Libro>();
    }

    // Getters y Setters
    public List<Usuario> getUsuarioBib() {
        return usuarioBib;
    }

    public void setUsuarioBib(List<Usuario> usuarioBib) {
        this.usuarioBib = usuarioBib;
    }

    public List<Libro> getLibrosBib() {
        return librosBib;
    }

    public void setLibrosBib(List<Libro> librosBib) {
        this.librosBib = librosBib;
    }


    //Metodos
    public boolean insertarLibroBib(Libro libro) {
        if (librosBib.contains(libro)) {
            return false;
        } else {
            librosBib.add(libro);
            return true;
        }

    }

    public boolean insertarUsuarioBib(Usuario usuario) {

        if (usuarioBib.contains(usuario)) {
            return false;
        } else {
            usuarioBib.add(usuario);
            return true;
        }

    }

    public boolean prestarLibro(String nombreUser, String nombreLibro){
        Usuario usuario = new Usuario(nombreUser);
        

        if(usuarioBib.contains(usuario)) {
            Libro libro = new Libro(nombreLibro);

            if (nombreLibro.equals(libro)) {

                

            } else {
                //mi bilbioteca no tiene ese libro
                System.out.println("No se puede prestar el libro ya que no pertenece al catálogo");
                return false;
            }

        } else {
            //mi bilbioteca no tiene libro
            System.out.println("No se puede prestar ese libro ya que el usuario no existe");
            return false;
        }
    }

    
    public static void main(String[] args) {

        Biblioteca biblioCesur = new Biblioteca();
        biblioCesur.insertarLibroBib(new Libro("El señor de los anillos"));
        biblioCesur.insertarLibroBib(new Libro("El árbol de la ciencia"));
        biblioCesur.insertarLibroBib(new Libro("El cuarto de atrás"));
        biblioCesur.insertarLibroBib(new Libro("El Quijote"));


        biblioCesur.insertarUsuarioBib(new Usuario("Fran"));
        biblioCesur.insertarUsuarioBib(new Usuario("Dario"));
        biblioCesur.insertarUsuarioBib(new Usuario("Fran"));
        biblioCesur.insertarUsuarioBib(new Usuario("Adrián"));
        biblioCesur.insertarUsuarioBib(new Usuario("Janhin"));

        Usuario fran = new Usuario("Fran");
        int indice;
        if(biblioCesur.getUsuarioBib().contains(fran)) {
           indice = biblioCesur.getUsuarioBib().indexOf(fran);
           biblioCesur.getUsuarioBib().get(indice).asignarLibro(null)
        }

    }
}
