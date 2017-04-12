package com.pioneer.students;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/students-info")
public class Students extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private StudentsInfo info;
	private List<String> studentsInfo;

	public Students() {
		info = new StudentsInfo();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		String firstName = req.getParameter("name");
		writer.println(new Date().toString());
		if (info.addList().containsKey(firstName)) {
			studentsInfo = new ArrayList<>();
			studentsInfo.addAll(info.addList().get(firstName));
			
			studentsInfo.stream().forEach(elem->
			writer.println("<br>" +elem)
			);
			
		}
	}

	@Override
	public void init() throws ServletException {
	}

}
