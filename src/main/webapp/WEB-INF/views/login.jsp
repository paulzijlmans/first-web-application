<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="/login" method="post">
    <p style="color: red">${errorMessage}</p>
    Name: <input type="text" name="name"/>
    Password: <input type="password" name="password">
    <input type="submit" value="Login"/>
</form>
</body>
</html>
