package com.seleco.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.seleco.entity.TeamName;
import com.seleco.model.TeamNameModel;

@WebServlet("/home")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String action = request.getParameter("action");
		String[] arrayTeamList = request.getParameterValues("team");
		
		switch (action) {
		case "enterTeamNames": {
			String totalTeams = request.getParameter("totalTeams");
			request.setAttribute("title", "RTM-Add Team Page");
			request.setAttribute("totalTeams", totalTeams);
			request.getRequestDispatcher("enterTeamNames.jsp").forward(request, response);
			break;
		}
		case "displayTeams": {
			
			List<String> randomTeamList = new TeamNameModel().teamLogic(arrayTeamList);
			request.setAttribute("title", "RTM-Display Team Page");
			request.setAttribute("randomTeamList", randomTeamList);
			request.getRequestDispatcher("displayTeams.jsp").forward(request, response);
			break;
		}
		case "home": {
			request.setAttribute("title", "RTM-Home Page");
			request.getRequestDispatcher("index.jsp").forward(request, response);
			break;
		}
		}

	}

}
