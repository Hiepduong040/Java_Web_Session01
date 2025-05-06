package com.data.java_web_session01;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "RegisterTicketServlet", value = "/RegisterTicket-servlet")
public class RegisterTicket extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        String fullname = request.getParameter("fullname");
        String className = request.getParameter("class");
        String vehicleType = request.getParameter("vehicleType");
        String licensePlate = request.getParameter("licensePlate");

        request.setAttribute("fullname", fullname);
        request.setAttribute("className", className);
        request.setAttribute("vehicleType", vehicleType);
        request.setAttribute("licensePlate", licensePlate);

        RequestDispatcher rq = request.getRequestDispatcher("resultRegister.jsp");
        rq.forward(request, response);
    }

    public void destroy() {
    }
}