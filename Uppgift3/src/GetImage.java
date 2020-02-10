

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetImage
 */
@WebServlet("/GetImage")
public class GetImage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetImage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO Auto-generated method stub
			
				//get the value of the chosen shape.
				PrintWriter writer =  response.getWriter();
				String shape = request.getParameter("shape") ;
				response.setContentType("text/html");
				
			//check which shapes is choosen in the radiobutton-menu and print according image.
			if (shape.equals("square")) {
				writer.print("<img src=\"square.jpg\">");

			} else if (shape.equals("triangle")) {
				writer.print("<img src=\"triangle.jpg\">");
			}
			else if (shape.equals("circle")) {
				writer.print("<img src=\"circle.jpg\">");
			}
			else if (shape.equals("octagon")) {
				writer.print("<img src=\"octagon.jpg\">");
			}
			
			 writer.close();

		}
	     
	     
	     
	     
	     
	    
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
