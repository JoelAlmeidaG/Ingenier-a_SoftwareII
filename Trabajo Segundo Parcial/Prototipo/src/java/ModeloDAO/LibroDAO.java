package ModeloDAO;

import ConexionDB.ConexionMySQL;
import Interfaces.LibroCrud;
import Modelo.Libro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class LibroDAO implements LibroCrud{
    ConexionMySQL conexionMySQL = new ConexionMySQL();
    Connection connection;
    PreparedStatement preparedStatement;
    ResultSet resultSet;
    Libro libro = new Libro();
    
    @Override
    public List listLibros() {
        ArrayList<Libro> list = new ArrayList<>();
        String query = "SELECT * FROM `libros`";
        try {
            connection = conexionMySQL.getConnection();
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Libro libro = new Libro();
                libro.setid(resultSet.getInt("id"));
                libro.setTitulo(resultSet.getString("Titulo"));                
                libro.setAutor(resultSet.getString("Autor"));                
                libro.setAño(resultSet.getString("Año"));
                libro.setGenero(resultSet.getString("Genero"));
                list.add(libro);
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
        return list;
    }
    
    @Override
    public Libro listLibro(int id) {
        String query = "SELECT * FROM `libros` WHERE id=" + id;
        try {
            connection = conexionMySQL.getConnection();
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                libro.setid(resultSet.getInt("id"));
                libro.setTitulo(resultSet.getString("Titulo"));                
                libro.setAutor(resultSet.getString("Autor"));                
                libro.setAño(resultSet.getString("Año"));
                libro.setGenero(resultSet.getString("Genero"));
            }
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
        return libro;
    }

    @Override
    public boolean addLibro(Libro libro) {
        String query = "INSERT INTO `libros`(`Titulo`, `Autor`, `Año`, `Genero`) "
                + "VALUES ('"
                + libro.getTitulo()
                + "','"
                + libro.getAutor()
                + "','"
                + libro.getAño()
                + "','"
                + libro.getGenero()
                + "')";
        try {
            connection = conexionMySQL.getConnection();
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
        return false;
    }
}
