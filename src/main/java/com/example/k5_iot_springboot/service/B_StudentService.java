package com.example.k5_iot_springboot.service;

import com.example.k5_iot_springboot.dto.B_Student.StudentCreateRequestDto;
import com.example.k5_iot_springboot.dto.B_Student.StudentResponseDto;

import java.util.List;

public interface B_StudentService {
    StudentResponseDto createStudent(StudentCreateRequestDto student);

    List<StudentResponseDto> getAllStudents();

    StudentResponseDto getStudentById(Long id);

    StudentResponseDto updatedStudent(Long id, StudentCreateRequestDto requestDto);

    void deleteStudent(Long id);

    List<StudentResponseDto> filterStudentByName(String name);
}
