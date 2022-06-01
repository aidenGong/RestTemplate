package com.example.mockrestful.domain;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Geo {
    private String lat;
    private String lng;
}
