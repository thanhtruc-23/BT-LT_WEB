<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Đăng Nhập</title>
</head>
<body>
    <h2>ĐĂNG NHẬP HỆ THỐNG</h2>
    
    <!-- Form gửi dữ liệu đăng nhập tới URL /login -->
    <form action="${pageContext.request.contextPath}/login" method="post">
        <div>
            <label>Username:</label><br/>
            <input type="text" name="username" required="required" placeholder="Nhập username..."/>
        </div>
        <br/>
        <div>
            <label>Password:</label><br/>
            <input type="password" name="password" required="required" placeholder="Nhập password..."/>
        </div>
        <br/>
        <button type="submit">Login</button>
    </form>
</body>
</html>