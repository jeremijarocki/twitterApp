package sda.soft.academy.twitter.servlets;

import sda.soft.academy.twitter.dto.TweetDto;
import sda.soft.academy.twitter.service.TweetService;
import sda.soft.academy.twitter.service.TweetServiceInMemoryImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "TweetListServlet", value = "/tweet/v1/list")
public class TweetListServlet extends HttpServlet {

    private TweetService tweetService = new TweetServiceInMemoryImpl();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        List<TweetDto> tweets = tweetService.findTweets();

        out.println("<html>\n" +
                "<body>\n" +
                "\n" +
                "<h4>List of tweets - simple form</h4>\n" +
                "<ul>\n");

        for (TweetDto tweetDto : tweets) {
            out.println("<li>" + tweetDto.getTitle() + " : " + tweetDto.getBody());
        }
        out.println("</ul>\n" +
                "\n" +
                "</body>\n" +
                "</html>");
    }
}
