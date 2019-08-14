
package Ecuaciones;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class solucion extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       int[][] ma = new int [2][2];
       int[][] mx = new int[2][2];
       int[][] my = new int [2][2];
       ma[0][0] = Integer.parseInt(request.getParameter("x1"));
       ma[0][1] = Integer.parseInt(request.getParameter("y1"));
       ma[1][0] = Integer.parseInt(request.getParameter("x2"));
       ma[1][1] = Integer.parseInt(request.getParameter("y2"));
       mx[0][0] = Integer.parseInt(request.getParameter("s1"));
       mx[0][1] = Integer.parseInt(request.getParameter("y1"));
       mx[1][0] = Integer.parseInt(request.getParameter("s2"));
       mx[1][1] = Integer.parseInt(request.getParameter("y2"));
       my[0][0] = Integer.parseInt(request.getParameter("x1"));
       my[0][1] = Integer.parseInt(request.getParameter("s1"));
       my[1][0] = Integer.parseInt(request.getParameter("x2"));
       my[1][1] = Integer.parseInt(request.getParameter("s2"));
       
        
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Soluciones</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet solucion at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    double determinante(double m[][]){
        return (m[0][0]*m[1][1])-(m[0][1]*m[1][0]);
    }
    
}
