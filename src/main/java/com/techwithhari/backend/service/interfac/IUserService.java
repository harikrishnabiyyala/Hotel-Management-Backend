package com.techwithhari.backend.service.interfac;


import com.techwithhari.backend.dto.LoginRequest;
import com.techwithhari.backend.dto.Response;
import com.techwithhari.backend.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}
