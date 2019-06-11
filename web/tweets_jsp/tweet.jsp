<%@ page import="sda.soft.academy.twitter.dto.TweetDto" %><%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 02.02.2019
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Tweet page</title>

</head>
<body>
<jsp:include page="nav.jsp"></jsp:include>

<h2>Selected tweet</h2>

<div class="container-fluid">
<form action="/action_page.php">

    <div class="form-group">
        <label for="title">Tweet title:</label>
        <input type="text" name="title" class=form-control" id="title" value="${tweet.title}">
    </div>

    <div class="form-group">
        <label for="body">Tweet body:</label>
        <textarea class="form-control" rows="5" id="body">${tweet.body}</textarea>
    </div>

    <br><br>
    <input type="submit" value="Submit">
</form>
</div>
<p>Klikając "submit" wyrażasz zgodę na to, że wszystkie twoje smutne pierdoły zostaną opublikowane!</p>
</body>
</html>
