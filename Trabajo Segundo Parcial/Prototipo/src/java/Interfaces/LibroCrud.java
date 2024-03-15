package Interfaces;

import Modelo.Libro;
import java.util.List;

public interface LibroCrud {
    
    public List listLibros();
    public Libro listLibro(int id);
    public boolean addLibro(Libro libro);
    
}
