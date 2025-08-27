package com.example.k5_iot_springboot.dto.G_User.request;

import com.example.k5_iot_springboot.common.enums.RoleType;
import org.springframework.lang.NonNull;

public record RoleModifyRequest(
        @NonNull
        RoleType role // 추가, 삭제 대상으로 사용할 역할
) {}
