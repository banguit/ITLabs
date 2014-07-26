package ua.net.itlabs.firstlesson;

import ua.net.itlabs.firstlesson.beans.ResultMessage;
import javax.servlet.*;
import java.io.IOException;

public class simpleAuthenticationFilter implements Filter {

    private static final String _userToCheck = "ITLabs";
    private static final String _passwordToCheck = "ITLabs";

    @Override public void init(FilterConfig filterConfig) throws ServletException { }

    @Override public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String username = servletRequest.getParameter("username");
        String password = servletRequest.getParameter("password");

        if (username != null &&
            password != null &&
            username.equals(_userToCheck) &&
            password.equals(_passwordToCheck))
        {
            filterChain.doFilter(servletRequest, servletResponse);
        }
        else
        {
            ResultMessage message = new ResultMessage("danger", "Authentication failed!");
            ServletContext sc = servletRequest.getServletContext();
            RequestDispatcher rd = sc.getRequestDispatcher("/index.jsp");
            servletRequest.setAttribute("message", message);
            rd.forward(servletRequest, servletResponse);
        }
    }

    @Override public void destroy() { }
}
