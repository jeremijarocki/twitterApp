<%@ page import="sda.soft.academy.twitter.dto.TweetDto" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 02.02.2019
  Time: 13:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List of tweets</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
<jsp:include page="nav.jsp"></jsp:include>

<div class="container">
    <h2>Tweets Table</h2>
    <table class="table">
        <thead>
        <tr>
            <th>Tweet's id</th>
            <th>Tweet's title</th>
            <th>Tweet's body</th>
            <th>Tweet's author</th>
            <th>Tweet's link</th>
        </tr>
        </thead>
        <tbody>
            <%
                List<TweetDto> tweets = (List<TweetDto>) request.getAttribute("tweetsModel");
                for (TweetDto tweetDto : tweets) {
            %>
            <tr>
            <td><%=tweetDto.getId()%></td>
            <td><%=tweetDto.getTitle()%></td>
            <td><%=tweetDto.getBody()%></td>
            <td><%=tweetDto.getLogin()%></td>
            <td><a href="http://localhost:8080/twitterApp_war_exploded/tweet?id=<%=tweetDto.getId()%>">Click here</a></td>
            </tr>
            <%
                }
            %>

        </tbody>
    </table>
</div>

</body>
</html>
