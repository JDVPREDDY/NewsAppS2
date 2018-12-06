package com.example.android.newsapp;

public class News {
    private String mCategory;
    private String mHeadline;
    private String mTime;
    private String mUrl;
    private String mAuthor;

    public News(String headline, String category, String time, String url, String author) {
        mHeadline = headline;
        mCategory = category;
        mTime = time;
        mUrl = url;
        mAuthor = author;
    }

    public String getCategory() {
        return mCategory;
    }

    public String getHeadline() {
        return mHeadline;
    }

    public String getTime() {
        return mTime;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public String getUrl() {
        return mUrl;
    }
}
