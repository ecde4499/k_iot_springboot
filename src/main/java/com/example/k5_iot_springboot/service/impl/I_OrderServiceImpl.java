package com.example.k5_iot_springboot.service.impl;

import com.example.k5_iot_springboot.service.I_OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

// 인터페이스의 추상 메서드를 Impl 클래스 파일에서 "강제 구현"
@Service
@RequiredArgsConstructor // final 필드 OR @NonNull 필드만을 매개변수로 가지는 생성자
public class I_OrderServiceImpl implements I_OrderService {

}
