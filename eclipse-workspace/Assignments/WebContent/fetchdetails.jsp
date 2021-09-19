<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"    %>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="Student" class="com.phase2.servlet.Student"/>
<jsp:setProperty property="*" name="Student"/>

Record:<br/>
<jsp:getProperty property="stuName" name="Student"/><br/>
<jsp:getProperty property="stuAge" name="Student"/><br/>
<jsp:getProperty property="stuEmail" name="Student"/><br/>
<jsp:getProperty property="studept" name="Student"/><br/>
<jsp:getProperty property="stuCourse" name="Student"/><br/> 
<jsp:getProperty property="stuId" name="Student"/><br/>
<jsp:include page="header.jsp" /> 
</body>
</html>