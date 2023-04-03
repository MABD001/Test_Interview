package com.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

public class API {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://taaskserver.herokuapp.com/api/user/getAllUsers";
        String data = restTemplate.getForObject(url, String.class);
        try{
        ObjectMapper objectMapper = new ObjectMapper();
        List<Object> jsonList = Arrays.asList(objectMapper.readValue(data, Object[].class));

        String formattedJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonList);
        System.out.println(formattedJson);
        } catch (JsonProcessingException e) {
                e.printStackTrace();
        }
    }
}
