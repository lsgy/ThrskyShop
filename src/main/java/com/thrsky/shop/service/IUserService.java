package com.thrsky.shop.service;

import com.thrsky.shop.common.ServerResponse;
import com.thrsky.shop.pojo.User;

/**
 * Created by thRShy on 2017/5/1.
 */
public interface IUserService {

    ServerResponse<User> login(String username, String password);

    ServerResponse<String> register(User user);

    ServerResponse<String> checkValid(String str,String type);

    ServerResponse selectQuestion(String username);

    ServerResponse<String> checkAnswer(String username,String answer,String question);
}
