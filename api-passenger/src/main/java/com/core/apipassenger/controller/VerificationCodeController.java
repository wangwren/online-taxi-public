package com.core.apipassenger.controller;

import com.core.apipassenger.request.VerificationCodeDto;
import com.core.apipassenger.service.VerificationCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VerificationCodeController {

    @Autowired
    private VerificationCodeService verificationCodeService;

    @GetMapping("/verification-code")
    public String verificationCode(@RequestBody VerificationCodeDto verificationCodeDto) {

        verificationCodeService.generatorCode(verificationCodeDto.getPassengerPhone());

        return "1234";
    }
}
