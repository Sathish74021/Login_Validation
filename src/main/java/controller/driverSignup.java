package controller;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ServletDto.EmployeDto;
import Servletdao.EmployeDao;

@WebServlet("/signup")
public class driverSignup extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doGet(req, resp);
		int eid = Integer.parseInt(req.getParameter("emp_id"));
		String ename = req.getParameter("emp_name");
		String email = req.getParameter("emp_email");
		String pswd = req.getParameter("emp_psw");
		String cpswd = req.getParameter("emp_cpwd");
		String dob = req.getParameter("emp_dob");
		String country = req.getParameter("emp_country");
		String gen = req.getParameter("gender");

		EmployeDto dto = new EmployeDto();
		dto.setEmp_Id(eid);
		dto.setEmp_Name(ename);
		dto.setEmp_Email(email);
		dto.setEmp_Password(pswd);
		dto.setEmp_ConfirmPassword(cpswd);
		dto.setEmp_DOB(dob);
		dto.setEmp_Country(country);
		dto.setGender(gen);

		EmployeDao dao = new EmployeDao();
		dao.insertion(dto);
		resp.getWriter().print("<h1>Account Created</h1>");

	}
}
