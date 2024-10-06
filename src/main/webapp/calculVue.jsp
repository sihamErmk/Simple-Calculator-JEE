<%@ page import="controller.CalculModel" %><%--
  Created by IntelliJ IDEA.
  User: Dell PC
  Date: 04/10/2024
  Time: 14:16
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    CalculModel model = (CalculModel) request.getAttribute("CalculModel");

%>
<html>
<head>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            color: #333;
            margin: 0;
            padding: 20px;
        }
        form {
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.1);
            max-width: 400px;
            margin: auto;
        }
        label {
            font-weight: bold;
        }
        input[type="number"], select, button {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border-radius: 4px;
            border: 1px solid #ccc;
        }
        button {
            background-color: #007bff;
            color: white;
            border: none;
            cursor: pointer;
        }
        button:hover {
            background-color: #0056b3;
        }
        h3 {
            text-align: center;
            color: #007bff;
        }
    </style>
</head>
<body>
<form action="calcul" method="post">
    <label>Entrez l'opérande 1:</label><br>
    <input type="number" name="Nombre1" required><br>

    <label>Choisissez une opération:</label><br>
    <select name="operation" required>
        <option value="Addition">Addition</option>
        <option value="Subtraction">Subtraction</option>
        <option value="Multiplication">Multiplication</option>
        <option value="Division">Division</option>
    </select><br>

    <label>Entrez l'opérande 2:</label><br>
    <input type="number" name="Nombre2" required><br>

    <button type="submit">Calculer</button>
</form>
<h3>Le résultat est : <%= model != null ? model.getResult() : "" %></h3>
  
  </body>
</html>
