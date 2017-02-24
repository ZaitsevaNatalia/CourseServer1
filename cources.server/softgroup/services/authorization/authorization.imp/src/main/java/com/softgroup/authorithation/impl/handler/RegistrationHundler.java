package com.softgroup.authorithation.impl.handler;

import com.softgroup.authorization.api.message.LoginRequest;
import com.softgroup.authorization.api.message.LoginResponse;
import com.softgroup.authorization.api.message.RegisterRequest;
import com.softgroup.authorization.api.message.RegisterResponse;
import com.softgroup.authorization.api.router.AuthorizationRequestHandler;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.AbstractRequestHandler;

import java.io.Serializable;

/**
 * Created by zajan on 23.02.2017.
 */
public class RegistrationHundler extends AbstractRequestHandler implements AuthorizationRequestHandler {

    @Override
    public String getName() {
        return "register";
    }


    public Response<?> handle(Request<?> msg)
    {
        return new Response<RegisterResponse>();
    }
}
