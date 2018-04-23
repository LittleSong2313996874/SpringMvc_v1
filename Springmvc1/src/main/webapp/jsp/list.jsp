<%@ page language="java" pageEncoding="UTF-8"%>
<%--引入JSTL核心标签库 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>显示用户信息</title>
    <style type="text/css">
        table,td{
            border: 1px solid;
            border-collapse: collapse;
        }
    </style>
</head>
<body>
<table border="2" align="center">
    <tr>
        <td>用户ID</td>
        <td>用户名</td>
        <td>性别</td>
        <td>年龄</td>
        <td>毕业院校</td>
        <td>师兄</td>
        <td><a href="${pageContext.request.contextPath}/jsp/welcome.jsp">返回首页 </a></td>
    </tr>
    <%--遍历lstUsers集合中的User对象 --%>
    <c:forEach var="user" items="${allUser}">
        <tr>
            <td>${user.id}</td>
            <td>${user.NAME}</td>
            <td>${user.gender}</td>
            <td>${user.age}</td>
            <td>${user.graduation}</td>
            <td>${user.senior}</td>
            <td>
                <a href="${pageContext.request.contextPath}/taskUser/prepare_update.action?id=${user.id}">修改</a>

                <a href="${pageContext.request.contextPath}/taskUser/delete.action?id=${user.id}">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>