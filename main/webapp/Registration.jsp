<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
   <meta charset="UTF-8">
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <title>Registration form</title>

   <!-- custom css file link  -->
   <link rel="stylesheet" href="css/LR.css">

</head>
<body>
   
<div class="form-container">

   <form action="Register" method="post">
      <h3>Register Here</h3>
     
      <input type="text" name="user_name" required placeholder="enter your name">
      <input type="email" name="user_email" required placeholder="enter your email">
      <input type="password" name="user_password" required placeholder="enter your password">
      <input type="password" name="user_cpassword" required placeholder="confirm your password">
      <input type="submit" name="submit" value="register now" class="form-btn">
      <p>already have an account? <a href="login.jsp">login now</a></p>
   </form>

</div>

</body>
</html>