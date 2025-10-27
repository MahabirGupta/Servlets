package com.mahabir;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/login.do")
public class LoginServlet extends HttpServlet {
	
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		 
//		PrintWriter out= response.getWriter();
//		out.println("<html>");
//		out.println("<head>");
//		out.println("<title>Yahoo!!!!</title>");
//		out.println("</head>");
//		out.println("<body>");
//		out.println("My First Servlet");
//		out.println("</body>");
//		out.println("</html>");
//		 String name = request.getParameter("name");//get the parameter from the url
//		 
//		 request.setAttribute("name", name);//set the parameter as the attribute to pass to the jsp
		 request.setAttribute("name", request.getParameter("name"));
		 request.setAttribute("password", request.getParameter("password"));
		 request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		 
	 }

}
