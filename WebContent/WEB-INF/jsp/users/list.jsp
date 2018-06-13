<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<!-- JSTL taglib import -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- Spring taglib import -->
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
lists


<h1>${requestContext.locale}</h1><br> requestContext

<c:choose>
<c:when test="${requestContext.locale.language eq 'en'}">
	<c:url var="localeUrl" value="/">
		<c:param name="locale" value="de"/>
	</c:url>
	<a href="${localeUrl}"><spring:message code="locale.de"/></a>
</c:when>
<c:otherwise>
<h1>${requestContext.locale.language}</h1><br> 3

</c:otherwise>
</c:choose>










</body>
</html>