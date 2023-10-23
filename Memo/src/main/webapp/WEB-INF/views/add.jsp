<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ include file="/WEB-INF/views/inc/asset.jsp" %>

</head>
<body>

	<%@ include file="/WEB-INF/views/inc/header.jsp" %>
	
	<!-- /memo 는 꼭 써야 servlet이 불러지며, 처음 프로젝트 만들때 지정해준거임 -->
	<form method="POST" action="/memo/addok.do"> 
	<table>
		<tr>
			<th>이름</th>
			<td><input type="text" name="name" required></td>
		</tr>
		<tr>
			<th>암호</th>
			<td><input type="password" name="pw" required></td>
		</tr>
		<tr>
			<th>메모</th>
			<td><textarea name="memo" required class="full"></textarea></td>
		</tr>
	</table>
	<div>
		<input type="button" value="돌아가기" onclick="location.href='/memo/list.do';">
		<input type="submit" value="쓰기">
	</div>
	
	</form>
	
	
	<script>
		
	</script>
	
</body>
</html>