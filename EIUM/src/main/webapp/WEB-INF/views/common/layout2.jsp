<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  isELIgnored="false"
 %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">

    <title><tiles:insertAttribute name="title" /></title>
  </head>
    <body topmargin="0"  leftmargin="0" marginwidth="0" marginheight="0">
    <div id="container">
      
      <div id="content">
          <tiles:insertAttribute name="body"/>
      </div>
   
    </div>
  </body>
</html>