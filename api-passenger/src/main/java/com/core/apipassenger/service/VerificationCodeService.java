package com.core.apipassenger.service;

import org.springframework.stereotype.Service;

@Service
public class VerificationCodeService {

    public String generatorCode(String passengerPhone) {

        //调用验证码服务，获取验证码

        //存入redis

        return "1234";
    }
}
