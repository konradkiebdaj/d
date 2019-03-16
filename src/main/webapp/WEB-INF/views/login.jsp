<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Konrad
  Date: 08.03.2019
  Time: 16:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<div style="margin: auto; width: 500px; padding-top: 50px">
    <form:form method="post" modelAttribute="loginUser">

        <div class="form-group">
            <label>Email</label>
            <form:input path="email" placeholder="Email" type="email" class="form-control"/>
            <form:errors path="email" cssStyle="color: red" class="form-text text-muted"/>
        </div>
        <div class="form-group">
            <label>Hasło</label>
            <form:input path="password" placeholder="Haslo" type="password" class="form-control"/>
            <form:errors path="password" cssStyle="color: red" cssClass="form-text text-muted"/>
        </div>
        <form:button type="submit" class="btn btn-success">Zaloguj</form:button>
    </form:form>
</div>
</body>
</html>
