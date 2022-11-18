
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Escuiquirin
 */
@WebServlet("/Sacarfactor")
public class SacarFactorServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String validacion = request.getParameter("numero");
            if (validacion == null || validacion.isEmpty()) {
                response.setContentType("text/html;charset=UTF-8");
                try ( PrintWriter out = response.getWriter()) {
                    System.out.println("Imprimiendo html");
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title> Factorial </title>");
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<h1> Usted NO relleno la casilla</h1>");
                    out.println("</body>");
                    out.println("</html>");
                }
            } else {
                Double numero = Double.valueOf(request.getParameter("numero"));
                if (numero < 1) {
                    response.setContentType("text/html;charset=UTF-8");
                    try ( PrintWriter out = response.getWriter()) {
                        System.out.println("Imprimiendo html");
                        out.println("<!DOCTYPE html>");
                        out.println("<html>");
                        out.println("<head>");
                        out.println("<title> Factorial </title>");
                        out.println("</head>");
                        out.println("<body>");
                        out.println("<h1> Usted ingreso un valor NULO o inferior</h1>");
                        out.println("</body>");
                        out.println("</html>");
                    }
                } else {
                    Double x = numero;
                    Double resultado = 1.0;
                    while (x != 0) {
                        resultado = resultado * x;
                        x--;
                    }
                    response.setContentType("text/html;charset=UTF-8");
                    try ( PrintWriter out = response.getWriter()) {
                        out.println("<!DOCTYPE html>");
                        out.println("<html>");
                        out.println("<head>");
                        out.println("<title> Factorial </title>");
                        out.println("</head>");
                        out.println("<body>");
                        out.println("<h1> Resultado del factorial </h1>");
                        out.println("<p> El factorial del numero " + numero + " es " + resultado + "</p>");
                        out.println("</body>");
                        out.println("</html>");

                    }
                }
            }
        } catch (NumberFormatException e){
            try ( PrintWriter out = response.getWriter()) {
                        out.println("<!DOCTYPE html>");
                        out.println("<html>");
                        out.println("<head>");
                        out.println("<title> Factorial </title>");
                        out.println("</head>");
                        out.println("<body>");
                        out.println("<h1> Usted no escribio el valor solicitado</h1>");
                        out.println("</body>");
                        out.println("</html>");
            }
        }

    }
}
