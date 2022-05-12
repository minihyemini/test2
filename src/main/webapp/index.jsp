<%--
  Class Name : index.jsp
  Description : 최초화면으로 메인화면으로 이동한다.(system)
  Modification Information
 
      수정일         수정자                   수정내용
    -------    --------    ---------------------------
     2011.08.31  JJY       경량환경 버전 생성
 
    author   : 실행환경 개발팀 JJY
    since    : 2011.08.31
--%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
<jsp:forward page="/cmm/main/mainPage.do"/>
--%>


<script type="text/javaScript">document.location.href="<c:url value='/cmm/main/mainPage.do'/>"</script>

<%--

<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" >
    <meta http-equiv="content-language" content="ko">
    <title>index</title>
    <link rel="icon" type="image/png" href="images/favicon.png">
</head>
<body>
<script type="text/javaScript">document.location.href="<c:url value='/cmm/main/mainPage.do'/>"</script>
</body>
</html>
--%>
