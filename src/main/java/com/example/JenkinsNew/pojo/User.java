package com.example.JenkinsNew.pojo;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User {
    private String userName;
    private String userEmail;
    private String userPhone;
}
