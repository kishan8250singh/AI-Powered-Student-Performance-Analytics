package com.springboot.demoSpring.Mapper;

import com.springboot.demoSpring.DTO.StudentDto;
import com.springboot.demoSpring.entity.StudentUser;

public class StudentMapper {

    public static StudentUser toEntity(StudentDto dto) {
        StudentUser user = new StudentUser();
        user.setUsername(dto.getUsername());
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());
        user.setRole(dto.getRole());
        return user;
    }

    public static StudentDto toDto(StudentUser user) {
        return new StudentDto(
                user.getUsername(),
                user.getEmail(),
                user.getRole(),
                user.getPassword());

    }
}
