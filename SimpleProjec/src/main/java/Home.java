

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		
		String firstName = request.getParameter("firstName") != null ? request.getParameter("firstName"): "Unknown";
		String lastName = request.getParameter("lastName") != null ? request.getParameter("lastName"): "Unknown";
		String language = request.getParameter("favoriteLanguage") != null ? request.getParameter("favoriteLanguage"): "Unknown";
		String town = request.getParameter("homeTown") != null ? request.getParameter("homeTown"): "Unknown";
		
		PrintWriter text = response.getWriter();
		
		text.write("<h1>Welcome, "+firstName+" "+lastName+"</h1>\n<p>Your favorite language is: "+language+"</p>\n<p> Your hometown is: "+town+"</p>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
