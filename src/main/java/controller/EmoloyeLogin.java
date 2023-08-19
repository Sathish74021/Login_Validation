package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ServletDto.EmployeDto;
import Servletdao.EmployeDao;

@WebServlet("/login")
public class EmoloyeLogin extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doGet(req, resp);
		String email = req.getParameter("email");
		String pswd = req.getParameter("pwd");

		EmployeDao dao = new EmployeDao();
		EmployeDto res = dao.valid(email);
		if (res != null) {
			if (res.getEmp_Password().equals(pswd)) {
//				resp.getWriter().print("<h1>Welcome to home page</h1>");
				resp.sendRedirect("https://en-gb.facebook.com/");
			} else {
				resp.getWriter().print("<h1> Enter proper password</h1>");
				RequestDispatcher rd = req.getRequestDispatcher("login.html");
				rd.include(req, resp);
			}
		} else {
			resp.getWriter().print("<h1>Account not found</h1><a href='signup.html'>Click here to signup</a>");
		}

	}
}
