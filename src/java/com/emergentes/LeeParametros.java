package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ivan Nina
 */
@WebServlet(name = "LeeParametros", urlPatterns = {"/LeeParametros"})
public class LeeParametros extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try{
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LeeParametros PROST (formulario)</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LeeParametros</h1>");
            out.println("<br><br>");
            out.println("<form action='' method='post'>");
            out.println("Nombre:");
            out.println("<imput type='text>' name='nombre' required>");
            out.println("<br>");
            out.println("Apellido:");
            
            out.println("<imput type='text>' name='apellido' required>");
            out.println("<br>");
            out.println("<input type='sudmit' value='Enviar'>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
       
    }finally{
            out.close();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        response.setContentType("text/html;chatset=UTF-8");
        PrintWriter out = response.getWriter();
        try{
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LeeParametros</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>LOs datos recibidos son:</h1>");
            
            if (nombre !=null || apellido !=null){
                out.println("sus datos son: <br>");
                out.println("Nombre:"+nombre+"<br>");
                out.println("Apellido:"+apellido+"<br>");
            }else{
                 out.println("no hay para mostrar:");
            }
             out.println("</body>");
             out.println("</html>");
        }finally{
            out.close();
                
            }
    }

}
