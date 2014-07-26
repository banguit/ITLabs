package ua.net.itlabs.firstlesson;

import ua.net.itlabs.firstlesson.beans.ResultMessage;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class simpleHttpServlet extends HttpServlet {

    @Override protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");

        String messageText = String.format("Hello %s!", username);
        ResultMessage message = new ResultMessage("info", messageText);

        ServletContext sc = getServletContext();
        RequestDispatcher rd = sc.getRequestDispatcher("/index.jsp");
        request.setAttribute("message", message);
        rd.forward(request, response);
    }
}
