<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<%-- 	<h1>
		Hi~ everyone, My name is
		<c:out value="${user.username}" />
		and Fullname is
		<c:out value="${user.fullname}" />
	</h1> --%>
	 <h1>Hi~ everyone, My name is ${model.username} and Fullname is ${model.fullname} and ${"hihihi"}</h1>	 
</body>
</html>