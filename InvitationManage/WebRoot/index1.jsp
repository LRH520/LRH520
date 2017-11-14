<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
  <head>   
    <title>回复</title>
  </head> 
  <body>
  <div align="center">
  <a href="insert.jsp">添加回复</a>
    <a href="getAll">返回回复</a>
   <table border="1">
			<tr>
				<td>回复</td>
				<td>作者</td>
				<td>发布时间</td>
			</tr>
			<c:forEach var="list" items="${list }" varStatus="st">
				<tr>
					<td>${list.content}</td>
					<td>${list.author }</td>
					<td>${list.createdate }</td>	
				</tr>
			</c:forEach>
		</table>
		</div>
  </body>
</html>
