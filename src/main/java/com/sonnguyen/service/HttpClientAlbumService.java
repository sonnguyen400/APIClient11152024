package com.sonnguyen.service;

import com.sonnguyen.model.Album;

import java.io.IOException;
import java.net.ConnectException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class HttpClientAlbumService extends IAlbumService {
    @Override
    public List<Album> findAll() throws IOException {
        try {
            HttpRequest httpRequest = HttpRequest.newBuilder()
                    .GET()
                    .uri(new URL(IAlbumService.url).toURI())
                    .build();
            HttpClient httpClient = HttpClient.newBuilder().build();
            HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() == 200) {
                return parseAlbumlist(response.body());
            }
            throw new ConnectException("Cannot connect to the server");
        } catch (URISyntaxException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
