package com.example.demo;

import org.springframework.web.client.RestTemplate;

public class API {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://taaskserver.herokuapp.com/api/user/getAllUsers";
        String result = restTemplate.getForObject(url, String.class);
        System.out.println(result);
    }
}
