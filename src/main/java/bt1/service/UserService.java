package bt1.service;

public class UserService {
    
    /**
     * Hàm kiểm tra đăng nhập
     * Tài khoản mặc định: username = admin, password = 123
     */
    public boolean checkLogin(String username, String password) {
        if ("admin".equals(username) && "123".equals(password)) {
            return true;
        }
        return false;
    }
}