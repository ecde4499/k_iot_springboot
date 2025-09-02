package com.example.k5_iot_springboot.dto.I_Order.response;

public class ProductResponse {
    /** 제품 리스트 응답 DTO */
    public record Response(
            Long id,
            String name,
            Integer price
    ) {}

    /** 제품 요약 응답 DTO */
    public record ListResponse(

    ) {}
}
