package com.example.k5_iot_springboot.service;

import com.example.k5_iot_springboot.dto.I_Order.request.ProductRequest;
import com.example.k5_iot_springboot.dto.I_Order.response.ProductResponse;
import com.example.k5_iot_springboot.dto.ResponseDto;
import com.example.k5_iot_springboot.security.UserPrincipal;
import jakarta.validation.Valid;

public interface I_ProductService {
    ResponseDto<ProductResponse.Response> create(UserPrincipal userPrincipal, ProductRequest.@Valid Create req);

    ResponseDto<ProductResponse.Response> update(Long productId, UserPrincipal userPrincipal, ProductRequest.@Valid Update req);

    ResponseDto<ProductResponse.Response> get(Long productId);
}
