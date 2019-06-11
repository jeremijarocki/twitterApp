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

@WebServlet(name = "tweetEditServlet", value = "/tweet/v1")
public class TweetEditServlet extends HttpServlet {

    private TweetService tweetService = new TweetServiceInMemoryImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter = resp.getWriter();

        String id = req.getParameter("id");
        Long tweetId = Long.valueOf(id);
        TweetDto tweetDto = tweetService.findTweetById(tweetId);

        printWriter.println("<html>\n" +
                "<body>\n" +
                "\n" +
                "<h2>Chosen tweet</h2>\n" +
                "\n" +
                "<form action=\"/action_page.php\">\n" +
                "  Tweet title:<br>\n" +
                "  <input type=\"text\" name=\"title\" value=\"" + tweetDto.getTitle() + "\">\n" +
                "  <br>\n" +
                "  Tweet body:<br>\n" +
                "  <textarea rows=\"4\" cols=\"50\">\n" +
                tweetDto.getBody() +
                "  </textarea>\n" +
                "  <br><br>\n" +
                "  <input type=\"submit\" value=\"Submit\">\n" +
                "</form> \n" +
                "<p>If you click the \"Submit\" button, the form-data will be sent to a page called \"/action_page.php\".</p>\n" +
                "</body>\n" +
                "</html>");
    }
}
