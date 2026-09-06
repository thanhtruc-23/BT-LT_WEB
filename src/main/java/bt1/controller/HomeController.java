package bt1.controller;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// Cấu hình URL pattern theo đề bài: /, /home
@WebServlet(urlPatterns = {"", "/", "/home"})
public class HomeController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        // Chuyển hướng hiển thị trang index.jsp
        req.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(req, resp);
    }
}