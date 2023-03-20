package com.example.jeudes;

import Entites.User;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.*;

@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {

    private User user;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/Home.jsp").forward(request,response);
        user = (User)getServletContext().getAttribute("user");
        System.out.println("from home page ");
        System.out.println(user);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession(true);

        int score = 0;
        int prevResult = 0;
        Random random = new Random();

        for(int i=0;i<20;i++){
            int result = random.nextInt(6)+1;
            if(result == prevResult){
                score +=20;
            }
            prevResult = result;
        }
        session.setAttribute("score", score);
    }
}
