package Controlador;

import Modelo.Libro;
import ModeloDAO.LibroDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controlador extends HttpServlet {
    
    String addLibro = "add.jsp";
    Libro libro = new Libro();
    LibroDAO libroDAO = new LibroDAO();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String access = "";
        String acction = request.getParameter("accion");
        switch (acction) {
            case "add": {
                access = addLibro;
            }
            break;
            case "Agregar": {
                String Titulo = request.getParameter("Titulo");
                String Autor = request.getParameter("Autor");
                String Año = request.getParameter("Año");
                String Genero = request.getParameter("Genero");
                libro.setTitulo(Titulo);
                libro.setAutor(Autor);
                libro.setAño(Año);
                libro.setGenero(Genero);
                libroDAO.addLibro(libro);
            }
        }
        RequestDispatcher view = request.getRequestDispatcher(access);
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
