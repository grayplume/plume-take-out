package com.plume.service;

import com.plume.dto.UserLoginDTO;
import com.plume.entity.User;

public interface UserService {

    /**
     * 微信登录
     * @param userLoginDTO
     * @return
     */
    User wxLogin(UserLoginDTO userLoginDTO);
}