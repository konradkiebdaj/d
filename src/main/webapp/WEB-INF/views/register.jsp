<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Konrad
  Date: 15.03.2019
  Time: 14:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Rejestracja nowego użytkownika</title>
</head>
<body>
<div style="margin: auto; width: 1000px; padding-top: 60px">
    <form:form method="post" modelAttribute="user">
        <div class="form-group">
            <label>Imię</label>
            <form:input path="name" type="text" class="form-control"/>
            <form:errors path="name" cssStyle="color: red" class="form-text text-muted"/>
        </div>
        <div class="form-group">
            <form:label path="surname" type="text" class="form-control"/>Nazwisko
            <form:input path="surname" type="text"/>
            <form:errors path="surname" cssStyle="color: red" class="form-text text-muted"/>
        </div>
        <div class="form-group">
            <form:label path="email">Email</form:label>
            <form:input path="email" type="email" class="form-control"/>
            <form:errors path="email" cssStyle="color: red" class="form-text text-muted"/>
        </div>
        <div class="form-group">
            <form:label path="password"/>Hasło
            <form:input path="password" type="password" class="form-control"/>
            <form:errors path="password" cssStyle="color: red" class="form-text text-muted"/>
        </div>
        <div class="form-group">
            <form:label path="confirmPassword"/>Powtórz hasło
            <form:input path="confirmPassword" type="password" class="form-control"/>
            <form:errors path="confirmPassword" cssStyle="color: red" class="form-text text-muted"/>
        </div>
        <form:button type="submit" class="btn btn-sucess">OK</form:button>
    </form:form>
</div>
</body>
</html>
