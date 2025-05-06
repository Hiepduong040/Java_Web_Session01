package com.data.java_web_session01;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "Ex03Servlet", value = "/Ex03-servlet")
public class Ex03 extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        String name = "Dương Sỹ Hiệp";
        int age = 18;

        request.setAttribute("name", name);
        request.setAttribute("age", age);

        RequestDispatcher rq = request.getRequestDispatcher("Bai3.jsp");
        rq.forward(request, response);
    }

    public void destroy() {
    }
}