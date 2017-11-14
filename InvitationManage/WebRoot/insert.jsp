<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
<head>
<title>新增</title>
</head>
<body>
	<div align="center">
		<form action="insert" method="post">
			<table border="1">
				<tr>
				<tr>
					<td>回复昵称人</td>
					<td><input type="text" name="invid"></td>
				</tr>
					<td>回复内容</td>
					<td><input type="text" name="content"></td>
				</tr>
				<tr>
					<td>回复昵称</td>
					<td><input type="text" name="author"></td>
				</tr>
				<tr>
					<td>回复时间</td>
					<td><input type="text" name="createdate"></td>
				</tr>
				<tr>
					<td><input type="submit" value="提交"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>
