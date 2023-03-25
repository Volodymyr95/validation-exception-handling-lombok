package com.example.demo.service;

import com.example.demo.dto.NewUserDto;
import com.example.demo.dto.UserDto;
import com.example.demo.dto.UserInfoDto;

import java.util.List;

public interface UserService {
    Long create(NewUserDto userDto);
    UserInfoDto getById(Long id);
    void delete(Long id);
    List<UserDto> getAll();

}
