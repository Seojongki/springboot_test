package com.thejoeun.springboot_test.signup.model.dto;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class AddUserRequest {
    private String email;
    private String password;

}
