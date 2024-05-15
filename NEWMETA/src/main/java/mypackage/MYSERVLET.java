package mypackage;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MYSERVLET extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MYSERVLET() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
			protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				// TODO Auto-generated method stub
			}


			/**
			 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
			 */
			protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				// TODO Auto-generated method stub
				
				RequestDispatcher dispatcher;
				
				
				String nome= request.getParameter("nome");
				String cognome= request.getParameter("cognome");
				
				request.setAttribute("nome", nome);
				request.setAttribute("cognome", cognome);
				
				dispatcher=getServletContext().getRequestDispatcher("/jsp/feedback.jsp");
				dispatcher.forward(request,response);
				
				
				//response.setContentType("text/html");
				//PrintWriter out=response.getWriter();
				//String nome=request.getParameter("nome");
				//String cognome=request.getParameter("cognome");
			
				    try {
				    	 
				    	Class.forName("com.mysql.jdbc.Driver");
						Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "utente");
					
						PreparedStatement stat= conn.prepareStatement("insert into controllo_accessi values(default,?,?)");
						stat.setString(1, nome);
						stat.setString(2, cognome);
						stat.executeUpdate();
						
				    
				    } catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	
			}
			
		}
