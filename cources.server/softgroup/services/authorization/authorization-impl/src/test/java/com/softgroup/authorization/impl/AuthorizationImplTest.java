package com.softgroup.authorization.impl;

import com.softgroup.authorithation.impl.handler.LoginHundler;
import com.softgroup.authorithation.impl.handler.RegistrationHundler;
import com.softgroup.authorithation.impl.router.AuthorizationRouter;
import com.softgroup.authorization.api.message.LoginRequest;
import com.softgroup.authorization.api.message.LoginResponse;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import org.junit.Test;

import java.io.Serializable;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AuthorizationImplTest
{
    @Test
    public void testAuthorization()
    {
        LoginHundler loginHundler = new LoginHundler();
        RegistrationHundler registrationHundler = new RegistrationHundler();

        final AuthorizationRouter authorizationRouter = new AuthorizationRouter(loginHundler, registrationHundler);

        Response<LoginResponse> response = authorizationRouter.handle(new Request<LoginRequest>());


    }
}
