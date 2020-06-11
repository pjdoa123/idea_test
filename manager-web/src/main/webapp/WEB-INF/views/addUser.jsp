<%--
  Created by IntelliJ IDEA.
  User: liu
  Date: 2020/6/10 0010
  Time: 17:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="http://localhost:9090/user/addUser" method="post">
        姓名：<input type="text" name="userName"><br/>
        年龄：<input type="text" name="userAge"><br/>
        <input type="submit" value="OKOK">
    </form>
</body>
</html>
