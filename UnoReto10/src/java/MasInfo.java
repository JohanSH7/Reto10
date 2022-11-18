
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
@WebServlet("/otraPagina")
public class MasInfo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title> Mas info NTF's </title>");
            out.println("</head>");
            out.println("<body bgcolor=\"#FDF5E6\">");
            out.println("<h1 align=\"center\"> Mas recursos sobre los NTF's </h1>");
            out.println("<ul>\n"
                    + "                <li>Para ver una explicación audiovisual de lo que es un sistema de archivos <a href=\"https://www.youtube.com/watch?v=ukzkZA73fkg\"> Haz clic aqui</a></li>\n"
                    + "                <li>Para ver directamente la definición por Microsoft sobre los NTF’s (ventajas, compatibilidad, requisitos, entre otros)<a href=\"https://learn.microsoft.com/es-es/windows-server/storage/file-server/ntfs-overview\"> Haz clic aqui</a></li>\n"
                    + "                <li>Para ver una explicación audiovisual de las diferencias entre los sistemas de archivo (inculyendo NTF’s) <a href=\"https://www.youtube.com/watch?v=n60uNP_R-ds\"> Haz clic aqui</a></li>\n"
                    + "                <li>Para ver una explicación de lo que son los sistemas de archivos, sus características, cual usar y como usarlo <a href=\"https://axarnet.es/blog/ntfs\"> Haz clic aqui</a></li>\n"
                    + "                <li>Para ver un artículo centrado en el análisis temporal del sistema de archivos NTFS y proyectar reglas intuitivas sobre las características de comportamiento de los archivos digitales relacionados <a href=\"https://ieeexplore.ieee.org/abstract/document/4155351\"> Haz clic aqui</a></li>\n"
                    + "                <li>En este artículo se examinan los métodos para ocultar datos en el sistema de archivos NTFS; además, se discuten las técnicas de análisis que se pueden aplicar para detectar y recuperar datos ocultos utilizando cada uno de estos métodos <a href=\"https://www.sciencedirect.com/science/article/abs/pii/S1742287606001265\"> Haz clic aqui</a></li>\n"
                    + "            </ul>");
            out.println("</body>");
            out.println("</html>");

        }
    }
}
