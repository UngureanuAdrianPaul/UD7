package libros;

public class Libro {

    // Atributos

    private String titulo;
    private boolean prestado;

    // Constructor

    public Libro(String titulo) {
        this.titulo = titulo;
        prestado = false;
    }

    // GETTERS Y SETTERS

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public boolean prestarLibro() {
        if (!prestado) {
            prestado = true;
            return true;
        }
        return false;
    }

    public boolean devolverLibro() {
        if (prestado) {
            prestado = false;
            return false;
        }
        return true;
    }


        @Override
        public boolean equals(Object obj) {
            return this.titulo.equals(((Libro) obj).getTitulo());
        }

}// End of Libro
