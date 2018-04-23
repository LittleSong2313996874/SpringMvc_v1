<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!-- 引入jstl核心标签库 -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>首页</title>
<%--	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">  --%>
  </head>
  
  <body>

		<a href="${pageContext.request.contextPath}/taskUser/getAll.action">展示全部</a>
		<a href="${pageContext.request.contextPath}/TryToAdd.jsp">增加 </a>
		<%--<a href=${pageContext.request.contextPath}/taskUser/getAll.action">下一页 </a>
		<a href="${pageContext.request.contextPath }/index?currentPage=${requestScope.pageBean.totalPage}">末页</a>--%>
	</body>
</html>









