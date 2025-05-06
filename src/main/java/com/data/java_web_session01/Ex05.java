package com.data.java_web_session01;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "Ex05Servlet", value = "/Ex05-servlet")
public class Ex05 extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            response.getWriter().write("Kết quả: " + result);
        } catch (ArithmeticException e) {
            request.setAttribute("errorMessage", "Đã xảy ra lỗi trong quá trình xử lý yêu cầu.");
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }
    public void destroy() {
    }
}