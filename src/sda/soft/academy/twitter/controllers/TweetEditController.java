package sda.soft.academy.twitter.controllers;

import sda.soft.academy.twitter.dto.TweetDto;
import sda.soft.academy.twitter.service.TweetService;
import sda.soft.academy.twitter.service.TweetServiceInMemoryImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "tweetEditController", value = "/tweet")
public class TweetEditController extends HttpServlet {

    private TweetService tweetService = new TweetServiceInMemoryImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id = req.getParameter("id");
        Long tweetId = Long.valueOf(id);
        TweetDto tweetDto = tweetService.findTweetById(tweetId); //na jakie zasadzie to tworzymy? Skąd mamy dostęp do tego tweetService? Gdzie tweetId zdefiniowaliśmy?
        req.setAttribute("tweet", tweetDto);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/tweets_jsp/tweet.jsp");
        requestDispatcher.forward(req, resp);
    }
}
