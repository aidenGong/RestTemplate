package com.example.mockrestful.controller;

import com.example.mockrestful.domain.User;
import com.example.mockrestful.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainController {
//    @Autowired
//    UserService userService;
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable(name = "id") int id) {
        String RequestUrl = "https://jsonplaceholder.typicode.com/users/" + id;

        ResponseEntity<User> responseEntity = null;
        try {
            responseEntity = restTemplate.exchange(
                    RequestUrl,
                    HttpMethod.GET,
                    null,
                    User.class
            );

        } catch (HttpClientErrorException e) {
            System.out.println(e.getStackTrace());
        }
//        User returnUserBuilder = User.builder().geo(responseEntity.getBody().getGeo()).build();
//        return returnUserBuilder;
        return responseEntity.getBody();

    }

}
