
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
       double[][] ma = new double [2][2];
       double[][] mx = new double[2][2];
       double[][] my = new double [2][2];
       ma[0][0] = Double.parseDouble(request.getParameter("x1"));
       ma[0][1] = Double.parseDouble(request.getParameter("y1"));
       ma[1][0] = Double.parseDouble(request.getParameter("x2"));
       ma[1][1] = Double.parseDouble(request.getParameter("y2"));
       mx[0][0] = Double.parseDouble(request.getParameter("s1"));
       mx[0][1] = Double.parseDouble(request.getParameter("y1"));
       mx[1][0] = Double.parseDouble(request.getParameter("s2"));
       mx[1][1] = Double.parseDouble(request.getParameter("y2"));
       my[0][0] = Double.parseDouble(request.getParameter("x1"));
       my[0][1] = Double.parseDouble(request.getParameter("s1"));
       my[1][0] = Double.parseDouble(request.getParameter("x2"));
       my[1][1] = Double.parseDouble(request.getParameter("s2"));
       double da = determinante(ma);
       double dx = determinante(mx);
       double dy = determinante(my);
       double x = dx/da;
       double y = dy/da;
        
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Soluciones</title>");            
            out.println("</head>");
            out.println("<body>");
            if(da!=0){
             out.println("<h1>La solucion del sitema de ecuaciones es:</h1>");
            out.print("<p>x = "+x+"<br><br> y = "+y+"</p>");   
            }
            else{
              out.println("<h1>El sistema no tiene solucion.</h1>");  
            }
            out.println("</body>");
            out.println("</html>");
        }
    }
    double determinante(double m[][]){
        return (m[0][0]*m[1][1])-(m[0][1]*m[1][0]);
    }
    
}
