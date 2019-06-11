package sda.soft.academy.twitter.dto;

public class TweetDto {
    private Long id;
    private String title;
    private String body;
    private String login;

    public TweetDto(Long id, String title, String body, String login) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.login = login;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public String getLogin() {
        return login;
    }
}
