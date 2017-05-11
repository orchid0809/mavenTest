package com.orchid0809.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JRebleServlet extends HttpServlet {

	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<String> lists = new ArrayList<String>();
		lists.add("lvcha1");  
		lists.add("lvcha");  
		lists.add("hongcha");     
		request.setAttribute("list", lists);
		System.out.println("lvcha");
		System.out.println("lvcha2");
		System.out.println("lvcha3");
		System.out.println("lvcha4");
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
}
