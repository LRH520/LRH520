<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>首页</title>
<script type="text/javascript">
function del()
{
    return confirm("是否删除");
   
  
}

</script>
</head>
<body>
	<div align="center">
		<h1>帖子列表</h1>
		<form action="getAll" method="post">
			帖子标题：<input type="text" name="title" id="title"> <input
				type="submit" value="搜索">
		</form>
		<table border="1">
			<tr>
				<td>标题</td>
				<td>内容摘要</td>
				<td>作者</td>
				<td>发布时间</td>
				<td>操作</td>
			</tr>
			<c:forEach var="list" items="${sessionScope.list }" varStatus="st">
				<tr>
					<td>${list.title }</td>
					<td>${list.summary }</td>
					<td>${list.author }</td>
					<td>${list.createdate }</td>
					<td><a href="All">查看回复</a>
					<a href="del?id=${list.id }" onclick="return del()">删除</a>
					</td>
				</tr>
			</c:forEach>
		</table>
		<div align="center">
			总页面[${pageIndex }/${countpage }] <a href="getAll?pageIndex=1">首页</a>
			<c:if test="${pageIndex>1}">
				<a href="getAll?pageIndex=${pageIndex-1 }">上一页</a>
			</c:if>
			<c:if test="${pageIndex<countpage}">
				<a href="getAll?pageIndex=${pageIndex+1 }">下一页</a>
			</c:if>
			<a href="getAll?pageIndex=${countpage }">末页</a>
		</div>
	</div>
</body>
	
</html>
