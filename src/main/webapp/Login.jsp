<%--
  Created by IntelliJ IDEA.
  User: Chaimae
  Date: 2/28/2023
  Time: 3:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style>
  input , select {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
  }

  input[type=submit] {
    width: 100%;
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
  }

  input[type=submit]:hover {
    background-color: #45a049;
  }

  div {
    border-radius: 5px;
    background-color: #f2f2f2;
    padding: 20px;
  }
</style>
<html>
<head>
    <title>Login</title>
</head>
<body>
<div>
<h1>Login</h1>
  <form method="post" action="LoginServlet">
    <label>Login :</label>
    <input type="text" name="login"/><br/>
    <label>Password :</label>
    <input type="password" name="password"/><br/>
    <input type="submit" value="Login"/><br/>
  </form>
</div>
</body>
</html>
