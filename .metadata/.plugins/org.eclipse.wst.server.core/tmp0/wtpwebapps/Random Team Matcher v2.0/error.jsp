<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error Page</title>
</head>
<body>
<h1>Something went wrong!</h1>
<form action="<%=request.getContextPath()%>/home" method="get">
<input type="hidden" name="action" value="home">
<input type="submit" value="Home">
</form>
</body>
</html>