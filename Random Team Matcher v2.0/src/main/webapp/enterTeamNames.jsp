<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ include file="/include/enterTeamNameHeader.jsp"%>
<form action="<%=request.getContextPath()%>/home" class="formClass" method="get">
	<ul class="list">
		<c:forEach begin="1" end="${param.totalTeams}">
			<li class="listElment">
			<input class="input" type="text" name="team" placeholder="Team Name" /></li>
			<!-- Enter Team Name : <input type="text" name="team"> -->
			<br />
		</c:forEach>
	</ul>
	<input type="hidden" name="action" value="displayTeams"> 
	<input type="submit" class="submitBtn" value="Result">
</form>
<%-- <form action="<%=request.getContextPath()%>/home" method="get">
<input type="hidden" name="action" value="home">
<input type="submit" value="Home">
</form> --%>

<%@ include file="/include/enterTeamNameFooter.jsp"%>