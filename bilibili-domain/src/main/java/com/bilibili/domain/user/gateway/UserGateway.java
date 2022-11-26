package com.bilibili.domain.user.gateway;

import com.bilibili.domain.user.User;
import com.bilibili.domain.user.UserInfo;

public interface UserGateway {


    Boolean checkByPhone(String phone);

    Boolean checkById(Long id);

    Boolean checkByNick(String nick);

    void register(User user);

    void modify(User user);

    void modify(UserInfo userInfo);

    String login(User user);

    UserInfo getUserInfoById(Long userId);

    UserInfo getUserInfoByNick(String nick);

}
