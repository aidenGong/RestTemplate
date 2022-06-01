package com.example.mockrestful.domain;

import lombok.*;
import org.springframework.stereotype.Service;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String username;
    private String email;
    private Address address;
//    private Geo geo;
    private String phone;
    private String website;
    private Company company;


}
