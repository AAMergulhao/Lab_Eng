package controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
//import java.io.PrintWriter;

@WebServlet({ "*.action", "/" })
public class ControllerServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		String path = req.getServletPath();
		ServletContext sc = req.getServletContext();
		switch (path) {
			case "/":
				System.out.println(path);
				try {
					sc.getRequestDispatcher("/jsp/login.jsp").forward(req, res);
				} catch (ServletException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;

			default:
				break;
		}
	}

	// @Override
	// public void doGet(HttpServletRequest req, HttpServletResponse res) {
	// String path = req.getServletPath();
	// System.out.println(path);
	// }
}