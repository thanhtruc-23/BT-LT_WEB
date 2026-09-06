package bt1.controller;

import java.io.IOException;
import bt1.service.UserService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/login"})
public class LoginController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    // Khai báo UserService để xử lý logic đăng nhập
    private UserService userService = new UserService();

    // Phương thức GET: Hiển thị form login.jsp
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
    }

    // Phương thức POST: Xử lý khi bấm nút "Login" trên form
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        // Lấy thông tin user nhập từ form
        String u = req.getParameter("username");
        String p = req.getParameter("password");

        // Gọi tầng Service kiểm tra
        if (userService.checkLogin(u, p)) {
            // Đúng -> chuyển tới đường dẫn /home
            resp.sendRedirect(req.getContextPath() + "/home");
        } else {
            // Sai -> chuyển tới đường dẫn /error
            resp.sendRedirect(req.getContextPath() + "/error");
        }
    }
}