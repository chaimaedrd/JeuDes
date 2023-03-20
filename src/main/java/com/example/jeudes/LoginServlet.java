package com.example.jeudes;

import Entites.User;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    private List<User> usersList;


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/Login.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        System.out.println(getServletContext().getAttribute("userList"));

        User user = findUser(login, password);

        if(user!=null){
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            response.sendRedirect("http://localhost:8080/JeuDes_war_exploded/HomeServlet"); //a changer par game page
        }else{
            //request.setAttribute("errorMessage", "Login or password invalid");
            response.getWriter().print("Login or password invalid");
        }
        getServletContext().setAttribute("user",user); //console affichage
    }

    private User findUser(String login,String password) {
        System.out.println("here 1");
        usersList = (List<User>)getServletContext().getAttribute("userList");
        for (User user : usersList) {
            System.out.println("here 2");

            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                System.out.println("here 3");

                return user;
            }
        }
        return null;
    }

}
