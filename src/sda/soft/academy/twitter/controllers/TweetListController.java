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
import java.util.List;

@WebServlet (name = "tweetListController", value = "/tweet/list")
public class TweetListController extends HttpServlet {

    private TweetService tweetService = new TweetServiceInMemoryImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<TweetDto> tweets = tweetService.findTweets();
        req.setAttribute("tweetsModel", tweets);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/tweets_jsp/tweets.jsp");
        requestDispatcher.forward(req,resp);
    }
}
