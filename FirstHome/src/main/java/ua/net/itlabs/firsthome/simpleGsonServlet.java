package ua.net.itlabs.firsthome;

import com.google.gson.Gson;
import ua.net.itlabs.firsthome.models.User;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class simpleGsonServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Create fake user object
        User user = new User(1, "Dmytro", "Antonenko");

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(new Gson().toJson(user));
    }
}
