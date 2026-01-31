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
        user.setAttendance(dto.getAttendance());
        user.setMarks(dto.getMarks());
        return user;
    }

    public static StudentDto toDto(StudentUser user) {
        StudentDto dto = new StudentDto();
        dto.setUsername(user.getUsername());
        dto.setEmail(user.getEmail());
        dto.setRole(user.getRole());
        dto.setPassword(user.getPassword());
        dto.setAttendance(user.getAttendance());
        dto.setMarks(user.getMarks());
        return dto;
    }
}
