package com.example.games.games;

public class Games {
    private Long id;
    private String title;
    private String company;
    private String releaseDate;

    public Games() {
    }

    public Games(Long id, String title, String company, String releaseDate) {
        this.id = id;
        this.title = title;
        this.company = company;
        this.releaseDate = releaseDate;
    }

    public Games(String title, String company, String releaseDate) {
        this.title = title;
        this.company = company;
        this.releaseDate = releaseDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Games{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", company='" + company + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                '}';
    }
}
