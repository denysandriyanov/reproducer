package com.something.userinfo;

import io.smallrye.mutiny.Uni;

import java.util.Map;


public interface UserInfoProvider {
    Uni<Map<String, Object>> getUserInfo();
}
