package Modelo;

public class Libro {
    
    private int id;
    private String Titulo;
    private String Autor;
    private String Año;
    private String Genero;
    
    public Libro(){
    }

    public Libro(int id, String Titulo, String Autor, String Año, String Genero) {
        this.id = id;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Año = Año;
        this.Genero = Genero;
    }
    

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getAño() {
        return Año;
    }

    public void setAño(String Año) {
        this.Año = Año;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }
    
}
