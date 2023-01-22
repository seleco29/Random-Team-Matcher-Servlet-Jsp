<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/include/indexHeader.jsp" %>
<form action="<%=request.getContextPath()%>/home" method="get" class="myForm text-center">
<label for="totalTeams" class="myInputLabel" >Enter the number of teams in total</label>
<input type="number" class="myInput" name="totalTeams" placeholder="Total Teams" required min="2">
<input type="hidden" name="action" value="enterTeamNames">
<br/>
<input type="submit" class="submitBtn" value="Submit">
</form>
<%@ include file="/include/indexFooter.jsp"%>
