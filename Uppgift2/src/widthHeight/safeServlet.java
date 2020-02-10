package widthHeight;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/safeServlet")
public class safeServlet extends HttpServlet {

    private static final long serialVersionUID = 1 ;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

 
        String width = req.getParameter("width");
        String height = req.getParameter("height");

        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        printWriter.print("<html>");
        printWriter.print("<body>");
        printWriter.print("<h1>secret size</h1>");
        printWriter.print("<p> Size = " + width + " x " + height + "</p>");
      
        printWriter.print("</body>");
        printWriter.print("</html>");
        printWriter.close();

       
    }
}
