package com.app.LaborNakuriBackend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class LoginResponse {
    private String token;

    private long expiresIn;

    public LoginResponse(String token, long expiresIn)
    {
        this.token=token;
        this.expiresIn=expiresIn;
    }
}
