package com.sapient.blog.springbootblogrestapi.service;

import com.sapient.blog.springbootblogrestapi.payload.LoginDto;
import com.sapient.blog.springbootblogrestapi.payload.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
}
