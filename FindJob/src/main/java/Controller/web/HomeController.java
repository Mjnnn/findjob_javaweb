package Controller.web;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Controller.model.User;

@WebServlet(urlPatterns = { "/trang-chu" })
public class HomeController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		User us = new User();
		us.setFullname("Từ Công Minh");
		us.setUsername("Min hihi");
		request.setAttribute("model", us);
		RequestDispatcher rd = request.getRequestDispatcher("test.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}
}
