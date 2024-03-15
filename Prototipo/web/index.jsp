<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="Modelo.Libro" %>
<%@ page import="ModeloDAO.LibroDAO" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSP Page</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-4">
        <h1 class="text-center mt-4">Lista de Libros - Biblioteca</h1>
        <table class="table table-primary table-bordered border-dark mt-4">
            <thead>
                <tr>
                    <th class="text-center">ID</th>
                    <th class="text-center">Título</th>
                    <th class="text-center">Autor</th>
                    <th class="text-center">Año</th>
                    <th class="text-center">Género</th>
                </tr>
            </thead>
            <%
                LibroDAO libroDAO = new LibroDAO();
                    List<Libro> list = libroDAO.listLibros();
                    Iterator<Libro> iter = list.iterator();
                    Libro libro = null;
                    while (iter.hasNext()) {
                        libro = iter.next();
            %>
            <tbody>
                <tr>
                    <td class="text-center"><%= libro.getid() %></td>
                    <td class="text-center"><%= libro.getTitulo() %></td>
                    <td class="text-center"><%= libro.getAutor() %></td>
                    <td class="text-center"><%= libro.getAño() %></td>
                    <td class="text-center"><%= libro.getGenero() %></td>
                </tr>
            </tbody>
            <% } %>
        </table>
        <a href="Controlador?accion=add">
            <button class="btn btn-success">
                Agregar Libro
            </button>
        </a>
    </div>
</body>
</html>
