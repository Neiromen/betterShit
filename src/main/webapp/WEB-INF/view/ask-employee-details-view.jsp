<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
    <h2>Employee, enter your details</h2>
    <br><br>
    <form:form action="showDetails" modelAttribute="employee">
        Name<form:input path="name"/>
        <form:errors path="name"/>
        <br><br>
        Surname<form:input path="surname"/>
        <form:errors path="surname"/>
        <br><br>
        Salary<form:input path="salary"/>
        <form:errors path="salary"/>
        <br><br>
        Department<form:select path="department">
<%--        <form:option value="Information Technology" label="IT"/>--%>
<%--        <form:option value="Human Resources" label="HR"/>--%>
<%--        <form:option value="Sales" label="Sales"/>--%>
        <form:options items="${employee.departments}"/>
    </form:select>
        <br><br>
        Which car do you want?
<%--        BMW<form:radiobutton path="carBrand" value="BMW"/>--%>
<%--        Audi<form:radiobutton path="carBrand" value="Audi"/>--%>
<%--        MB<form:radiobutton path="carBrand" value="Mercedes-Benz"/>--%>
        <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
        <br><br>
        Phone number<form:input path="phoneNumber"/>
        <form:errors path="phoneNumber"/>
        <br><br>
        Email<form:input path="email"/>
        <form:errors path="email"/>
        <input type="submit" value="OK">
    </form:form>
</body>
</html>
