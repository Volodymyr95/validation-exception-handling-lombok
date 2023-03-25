package com.example.demo.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class NewUserDto {

    @Size(min = 3)
    private String firstName;
    @Size(min = 3)
    private String lastName;
    @Min(2)
    private int age;
    @Email
    private String email;
    @Size(min = 6)
    private String password;

}
