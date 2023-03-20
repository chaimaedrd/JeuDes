<%--
  Created by IntelliJ IDEA.
  User: Chaimae
  Date: 3/1/2023
  Time: 9:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    p, h1{
        text-align: center;
        padding: 12px 20px;
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
<body>
<div>
    <H1>Hello!</H1>
    <p> votre score est : <%= session.getAttribute("score")%></p>
    <form method = "post">
        <input type="submit" value="Lancer les des">
    </form>
</div>
</body>
</html>
