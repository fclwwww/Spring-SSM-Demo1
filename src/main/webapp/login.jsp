<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2022/6/11
  Time: 14:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <base href="${pageContext.request.contextPath}/">
    <title>Title</title>
</head>
<body>
    ${tip}
    <form action="user/login" method="post">
        <p>用户名<input type="text" name="userName"></p>
        <p>用户密码<input type="password" name="userPwd"></p>
        <p><input type="submit" value="登录"></p>
    </form>
</body>
</html>
