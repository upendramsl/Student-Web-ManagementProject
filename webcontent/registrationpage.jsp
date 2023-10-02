<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Registration</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</head>
<body>

<header style="color:white">

	<nav class="navbar navbar navbar-dark bg-primary">
  <div class="container-fluid">
    <a class="navbar-brand" href="#"><h1>Palle Technologies</h1></a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="startuppage.jsp">Home</a>
        </li>
      </ul>
 
    </div>
  </div>
</nav>
</header>

<br/>
<br/>
<div class="container" style="width:50%">
<h1>Welcome to Student Registration</h1>
<marquee behavior="scroll" direction="left"><h2>Please Fill Details Carefully</h2></marquee>
<form action="reg" method="post">
	<div class="mb-3">
  		<label for="exampleFormControlInput1" class="form-label">Name</label>
  		<input type="text" value="<c:out value="${student.name}"></c:out>" class="form-control" id="exampleFormControlInput1" name="tbName" placeholder="Enter your Name" required="required">
	</div>
	
	<div class="mb-3">
 	 <label for="exampleFormControlInput2" class="form-label">Email address</label>
  	<input type="email" value="<c:out value="${student.email}"></c:out>" class="form-control" id="exampleFormControlInput2" name="tbEmail" placeholder="Enter your Email" required="required">
	</div>

	<div class="mb-3">
  		<label for="exampleFormControlInput3" class="form-label">Mobile</label>
  		<input type="tel" value="<c:out value="${student.mobile}"></c:out>" class="form-control" id="exampleFormControlInput3" name="tbMobile" placeholder="Enter your mobile no" required="required">
	</div>
	<div class="mb-3">
  		<label for="exampleFormControlInput4" class="form-label">Password</label>
  		<input type="password" value="<c:out value="${student.password}"></c:out>" class="form-control" id="exampleFormControlInput4" name="tbPass" placeholder="Enter password" required="required">
	</div>
	
	<div>
		<button class="btn btn-success">Register</button>
	</div>
	
	</form>
	
	
</div>


</body>
</html>