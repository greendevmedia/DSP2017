package in.greendev.dsp2017.model.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.greendev.dsp2017.model.Client;
import in.greendev.dsp2017.model.DB.EntityManagerAccess;

public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegistrationServlet() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.sendRedirect("/schedule-calendar/index.jsp");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		Client client = new Client();

		client.setFirstName(firstName);
		client.setLastName(lastName);
		client.setEmail(email);
		client.setPassword(password);

		EntityManagerAccess<Client> entityManagerAccess = new EntityManagerAccess<Client>();
		String query = "select e from Client e where e.email = '" + client.getEmail() + "'";
		List<Client> clientsList = entityManagerAccess.queryForDB(query, Client.class);

		if (clientsList.size() == 0) {
			entityManagerAccess.saveInDB(client);
			System.out.println("Użytkownik zapisany");
			doGet(request, response);
		} else {
			System.out.println("Liczba takich adresów w bazie: " + clientsList.size());
			System.out.println("wpisz inny adres");
			doGet(request, response);
		}
	}

}
