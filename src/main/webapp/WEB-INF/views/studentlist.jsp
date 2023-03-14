<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!--To write basic java logic-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html lang="en">
<head>
<title>Student Information</title>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="stylesheet"
    	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
    	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
    	crossorigin="anonymous">
    <link rel="stylesheet"
    	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>

<div class="container" style="background:black">
		<div class="jumbotron" style="margin: 0px 0px">
 <h1 class="text-center">NIIT WAVE 26 Student Details</h1>
     <table border="5" width="100%" height="100%" cellpadding="10">
    <h2> <a href="http://localhost:8085/StdentManagmentSystem/"> Home </a></h2>
     <tr>
        <th>Student Roll No</th>
        <th>Student Name</th>
        <th>Student Class</th>
        <th>Student Date of Birth</th>
        <th>Update Student Info</th>
        <th>Delete Student Info</th>
       </tr>

       <c:forEach var="student" items="${studentlist}">
       <tr>
            <td>${student.studentRollNo}</td>
            <td>${student.studentName}</td>
            <td>${student.studentClass}</td>
            <td>${student.studentDOB}</td>
            <td><a href="updateStudent/${student.studentRollNo}">Update Student Info</a></td>
            <td><a href="deleteStudent/${student.studentRollNo}">Remove Student</a></td>
       </tr>
       </c:forEach>
       </table>
</div>
</body>
</html>