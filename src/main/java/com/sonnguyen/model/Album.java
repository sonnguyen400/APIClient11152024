package com.sonnguyen.model;

public class Album {
    private long userId;
    private long id;
    private String title;

    public Album(long userId, long id, String title) {
        this.userId = userId;
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Album{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
