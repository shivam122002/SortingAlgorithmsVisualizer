<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Home Page</title>
	<link rel="stylesheet"   href="css/style.css">
	<style>
		body {
  margin: 0;
  padding: 0;
  background: url("img/bg.png") no-repeat center center fixed;
  -webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover;
  background-size: cover;
}

nav {
  display: flex;
  flex-direction: row;
  align-items: center;
}

nav a {
  color: #fff;
  text-decoration: none;
  padding: 10px;
  margin: 0 10px;
  font-weight: bold;
  font-size: 1.2em;
}

nav a:hover {
  color: #f1c40f;
}

h1 {
  font-size: 4em;
  margin: 0;
  padding: 50px;
  text-align: center;
  color: #fff;
}

section {
  display: flex;
  flex-wrap: wrap;
  justify-content: center;
  align-items: center;
  padding: 50px;
}

article {
  display: flex;
  flex-direction: column;
  align-items: center;
  margin: 20px;
  padding: 20px;
  background-color: #fff;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.3);
  text-align: center;
  max-width: 400px;
  min-width: 250px;
}

article h2 {
  font-size: 2em;
  margin: 0;
  margin-bottom: 10px;
  color: #333;
}

article p {
  font-size: 1.2em;
  margin: 0;
  margin-bottom: 20px;
  color: #666;
}

article a {
  background-color: #f1c40f;
  color: #fff;
  text-decoration: none;
  padding: 10px 20px;
  border-radius: 5px;
  transition: background-color 0.2s ease-in-out;
}

article a:hover {
  background-color: #e67e22;
}

.dropdown {
  position: relative;
  display: inline-block;
  margin-left: 10px;
}

.dropdown-content {
  display: none;
  position: absolute;
  right: 0;
  background-color: #f1f1f1;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
  z-index: 1;
}

.dropdown:hover .dropdown-content {
  display: block;
}

.dropdown-content a {
  color: #333;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
}

.dropdown-content a:hover {
  background-color: #ddd;
}

@media only screen and (max-width: 768px) {
  h1 {
    font-size: 2em;
    padding: 20px;
  }

  section {
    padding: 20px;
  }

  article {
    margin: 10px;
    padding: 10px;
    max-width: 100%;
  }

	</style>
</head>
<body>
	<body class ="bg">
    <div class="container">
        <div class="header">
            <nav>
                <ul>
                    <button class="btn" id="btn1" onclick="logout()">Log Out</button>
                    <li class="dropdown">
                        <button class="btn" style="text-transform: uppercase;
                                           background: linear-gradient(to bottom, #378de5 3%, #fff 100%);
                                           border-radius: 30px;
                                           border: 1px solid #5e97d1;
                                           cursor: pointer;
                                           color: #fff;
                                           font-family: 'Poppins', sans-serif;
                                           font-size: 17px;
                                           font-weight: 700;
                                           padding: 12px 65px;
                                           margin: 10px;
                                           text-decoration:none;
                                           box-shadow: 1px 4px 12px rgba(94,28,68,.15); 
                                           text-shadow: 0px 1px 0px #528ecc;">
                                        <% 
                                           String userName = (String) session.getAttribute("user_name");
                                           if(userName != null) {
                                           out.print(userName);
                                           } else {
                                               out.print("User");
                                                 }
                                        %>
                          </button>
                        <div class="dropdown-content">
                            <a href="#">Profile</a>
                            <a href="#">Setting</a>
                            <a href="#">Policies</a>
                        </div>
                    </li>
                </ul>
            </nav>
        </div>
        <div>
            <div class="welcome-text">
              <button class="btn" id="btn2"><a href="index.jsp" style="text-decoration:none;">Learning_Point</a></button><br>
               <br>
               <hr><br>
              <button class="btn" id="btn3"><a href="AlgorithmsVisualizer/index.html" style="text-decoration:none;">Algorithm_Visualizer</a></button><br>
            </div>
        </div>
       </div>
   
   <script>
   function logout() {
	   // send a logout request to the server
	   var xhr = new XMLHttpRequest();
	   xhr.open("POST", "/logout");
	   xhr.send();
	   // redirect the user to the login page
	   window.location.href = "index.jsp";
	 }

   </script>
</body>
</html>