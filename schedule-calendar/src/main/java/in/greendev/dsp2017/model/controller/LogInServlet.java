package in.greendev.dsp2017.model.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.greendev.dsp2017.model.Client;
import in.greendev.dsp2017.model.DB.EntityManagerAccess;

public class LogInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LogInServlet() {
        super();      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		EntityManagerAccess<Client> entityManagerAccess = new EntityManagerAccess<Client>();
		String query = "select e from Client e where e.email = '" + email +"'";
		
		try{
			List<Client> clientFromList = entityManagerAccess.queryForDB(query, Client.class);
			Client client = clientFromList.get(0);
			if(client.getPassword().equals(password)){
				System.out.println("Hasło poprawne użytkownik zalogowany");
				RequestDispatcher dispatcher = request.getRequestDispatcher("clientView.jsp");
				dispatcher.forward(request, response);
			}else{
				RequestDispatcher dispatcher = request.getRequestDispatcher("wrongLogIn.jsp");
				dispatcher.forward(request, response);
			}
			
		}catch (Exception e){
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("wrongLogIn.jsp");
			dispatcher.forward(request, response);
		}
	}

}
