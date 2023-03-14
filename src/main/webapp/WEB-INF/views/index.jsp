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
<body onload="">
<div class="container">
		<div class="jumbotron" style="margin: 45px 0px">
			<h2 class="text-center">NIIT Wave 26 Student Data</h2>
			<h2> <a href="http://localhost:8085/StdentManagmentSystem/NIITStudentData">Enrolled Students</a></h2>
        		</div>
<form method="POST" action="saveStudentData" modelAttribute="student">
<div class="form-group">
				<label for="studentRollNo">student  Roll  No</label>
				<input type="text"
					class="form-control" id="studentRollNo" aria-describedby="name"
					placeholder="Enter Student Roll No" name="studentRollNo">
			</div>

			              <div class="form-group">
            				<label for="studentName">student Name</label>
            				<input type="text"
            					class="form-control" id="studentName" aria-describedby="name"
            					placeholder="Enter Student Name" name="studentName">
            		      	</div>

            <div class="form-group">
            <label for="studentClass">student Class</label>
            <input type="text"
           class="form-control" id="studentClass" aria-describedby="name"
            placeholder="Enter Student Class" name="studentClass">
            </div>

            <div class="form-group">
                        <label for="studentDOB">student Date Of Birth</label>
                        <input type="text"
                       class="form-control" id="studentDOB" aria-describedby="name"
                        placeholder="Enter Student DOB" name="studentDOB">
                        </div>
                <button type="submit" class="btn btn-primary">Submit</button>
</body>