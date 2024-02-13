package com.example.consumingrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class MovieService {

    @Autowired
    RestTemplate restTemplate;

    protected Root getMovieResponse() {

         String url = "https://moviesdatabase.p.rapidapi.com";

                UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url)
                        .queryParam("param1", "valor1")
                        .queryParam("param2", "valor2");

                Root data = restTemplate.getForObject(
                    "https://moviesdatabase.p.rapidapi.com/titles", Root.class);
        return data;
    }
}