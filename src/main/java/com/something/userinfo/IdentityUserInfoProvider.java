package com.something.userinfo;

import io.quarkus.arc.lookup.LookupIfProperty;
import io.quarkus.grpc.GrpcClient;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import lombok.AllArgsConstructor;
import userinfo.UserInfoService;

import java.util.Map;

@AllArgsConstructor
@LookupIfProperty(name = "auth.identity-service-enabled", stringValue = "true")
@ApplicationScoped
public class IdentityUserInfoProvider implements UserInfoProvider {
    @GrpcClient("userInfoService")
    UserInfoService userInfoService;

    public Uni<Map<String, Object>> getUserInfo() {
        //just something...
        return null;
    }
}
