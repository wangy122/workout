package com.as.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class setup
 */
@WebServlet("/setup")
public class setup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public setup() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");
		
		String group=request.getParameter("group");
		String name=request.getParameter("name");
		String name2=request.getParameter("name2");
		String name3=request.getParameter("name3");
		String set1 [] =request.getParameterValues("set1");
		String sport1 [] =request.getParameterValues("sport1");
		String set2 [] =request.getParameterValues("set2");
		String sport2 [] =request.getParameterValues("sport2");

		
		PrintWriter out=response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<style>");
		out.println("table, th, td {border-collapse: collapse;}");
		out.println("th,td{padding: 15px; }");
		out.println("</style>");
		out.println("<title>WorkOut</title>");
		out.println("</head>");
		out.println("<body>");
		out.println(group+": ");
		out.println(name);
		out.println(name2);
		out.println(name3);
		out.println("</br>\n" + 
				"<hr>");
		out.println("<h2 style=\"text-align:center;\">");
		for(String s1 : set1) {
			out.println(s1);
		}
		for(String p1 : sport1) {
			out.println(p1);
		}
		out.println("</h2>");
		out.println("</br>");
		out.println("<table style=\"width:100%\" border=\" 1px solid black\" ");
		out.println("<tr>\n" + "<td>" + name + "</td>" + "<td> " + "</td>" 
				+ "<td>" + "</td>" + "<td>" + "</td>" +"</tr>");
		out.println("<tr>\n" + "<td>" + name2 + "</td>" + "<td> " + "</td>" 
				+ "<td>" + "</td>" + "<td>" + "</td>" +"</tr>");
		out.println("<tr>\n" + "<td>" + name3 + "</td>" + "<td> " + "</td>" 
				+ "<td>" + "</td>" + "<td>" + "</td>" +"</tr>");
		out.println("</table>");
		out.println("</br>");
		out.println("<h2 style=\"text-align:center;\">");
		out.println("</br>");
		for(String s2 : set2) {
			out.println(s2);
		}
		for(String p2 : sport2) {
			out.println(p2);
		}
		out.println("</h2>");
		out.println("<table style=\"width:100%\" border=\" 1px solid black\"");
		out.println("<tr>\n" + "<td>" + name + "</td>" + "<td> " + "</td>" 
				+ "<td>" + "</td>" + "<td>" + "</td>" +"</tr>");
		out.println("<tr>\n" + "<td>" + name2 + "</td>" + "<td> " + "</td>" 
				+ "<td>" + "</td>" + "<td>" + "</td>" +"</tr>");
		out.println("<tr>\n" + "<td>" + name3 + "</td>" + "<td> " + "</td>" 
				+ "<td>" + "</td>" + "<td>" + "</td>" +"</tr>");
		out.println("</table>");
		
		out.println("</body>");
		out.println("</html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
response.setContentType("text/html; charset=UTF-8");
		
		String name=request.getParameter("name");
		
		PrintWriter out=response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>WorkOut</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("name:"+ name);
		out.println("</body>");
		out.println("</html>");
	}

}
