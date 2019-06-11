package sda.soft.academy.twitter.service;

import sda.soft.academy.twitter.dto.TweetDto;

import java.util.List;

public interface TweetService {

    // poniżej stworzono dwie metody mające na celu operowanie bazą dostępnych tweetów

    List<TweetDto> findTweets();
    TweetDto findTweetById(Long tweetId);
}
