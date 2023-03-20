package com.example.jeudes;

import Entites.User;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.*;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

    private List<User> userList = new ArrayList<User>();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/Register.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        boolean exist = false;

        User user = new User(firstName, lastName, login, password);

        for(User usr : userList){
            if(user.getFirstName().equals(usr.getFirstName()) && user.getLastName().equals(usr.getLastName()) && user.getLogin().equals(usr.getLogin())){
                exist = true;
                break;
            }
        }
        if(!exist){
            userList.add(user);
            getServletContext().setAttribute("userList",userList);
            System.out.println(getServletContext().getAttribute("userList"));

        }
        response.sendRedirect("LoginServlet");

    }
}
