package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author Ivan Nina
 */
@WebServlet(name = "InfoCabeceras", urlPatterns = {"/InfoCabeceras"})
public class InfoCabeceras extends HttpServlet {

   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;chatset=UTF-8");
        PrintWriter out = response.getWriter();
        try{
            out.println("<!DOTCYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet InfoCabeceras</title>");            
            out.println("</head>");
            out.println("<body>");
            Enumeration e = request.getHeaderNames();
            while (e.hasMoreElements()){
                String cabe = (String) e.nextElement();
                String value = request.getHeader(cabe);
                out.println(cabe + " = " + value + "<br>");
                
            }
            out.println("</body>");
            out.println("</html>");
    }finally{
            out.close();
        }
    }

}
