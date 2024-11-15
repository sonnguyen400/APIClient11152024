package com.sonnguyen;

import com.sonnguyen.service.HttpClientAlbumService;
import com.sonnguyen.service.IAlbumService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        IAlbumService albumsService = new HttpClientAlbumService();
    }
}