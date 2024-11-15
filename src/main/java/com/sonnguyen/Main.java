package com.sonnguyen;

import com.sonnguyen.model.Album;
import com.sonnguyen.service.HttpClientAlbumService;
import com.sonnguyen.service.IAlbumService;
import com.sonnguyen.utils.TextFileUtils;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        IAlbumService albumsService = new HttpClientAlbumService();
        List<Album> albums=albumsService.findAll();
        TextFileUtils.saveListAlbums(albums);
    }
}