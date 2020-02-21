package com.jsp_app.servlets;

import com.jsp_app.models.Users;
import com.jsp_app.dao.UserDAO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, java.io.IOException {
        try {
             Users user = new Users();
             user.setUserName(request.getParameter("un"));
             user.setPassword(request.getParameter("pw"));
             user = UserDAO.login(user);
             if (user.isValid()) {
                HttpSession session = request.getSession(true);
                session.setAttribute("currentSessionUser",user);
                response.sendRedirect("products");
             }
             else response.sendRedirect("invalidLogin.jsp");
        }
        catch (Throwable theException) {
            System.out.println(theException);
        }
    }
}