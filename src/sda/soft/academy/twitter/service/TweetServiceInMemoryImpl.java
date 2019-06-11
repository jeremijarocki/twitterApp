package sda.soft.academy.twitter.service;

import sda.soft.academy.twitter.dto.TweetDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TweetServiceInMemoryImpl implements TweetService {

    private static Map<Long, TweetDto> tweets = new HashMap<>();

    // poniżej dodajemy początkowe tweety do bazy, by było co wyświetlać
    {
        tweets.put(1l, new TweetDto(1l, "Pierwszy tweet", "Zupełnie pierwszy wpis. Chcemy sprawdzić czy działa dodawanie tweetów"
                , "Jeremi"));
        tweets.put(2l, new TweetDto(2l, "Drugi wpis", "Ciekawe informacje, które mają za zadanie wypełnić aplikację"
                , "Kasia"));
        tweets.put(3l, new TweetDto(3l, "Trzecia wiadomość", "Artykuł o sensie stosowania JSP i servletów :)"
                , "Admin"));
        tweets.put(4l, new TweetDto(4l, "Czwarty tweet", "Zupełnie nic nie wnoszący tweet, czyli tak jak 99% tychże wiadomości"
                , "Jeremi"));
        tweets.put(5l, new TweetDto(5l, "Piąty post", "Sprwadzamy czy ciągle działą", "Michał"));
    }

    @Override
    public List<TweetDto> findTweets() {
        return new ArrayList<>(tweets.values());
    }

    @Override
    public TweetDto findTweetById(Long tweetId) {
        return tweets.get(tweetId);
    }
}
