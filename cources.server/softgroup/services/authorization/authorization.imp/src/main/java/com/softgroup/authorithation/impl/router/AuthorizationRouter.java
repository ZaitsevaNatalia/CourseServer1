package com.softgroup.authorithation.impl.router;

import com.softgroup.authorithation.impl.handler.LoginHundler;
import com.softgroup.authorithation.impl.handler.RegistrationHundler;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.AbstractRequestHandler;
import com.softgroup.common.router.api.AbstractRouterHandler;
import com.softgroup.common.router.api.Handler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import com.softgroup.common.datamapper.JacksonDataMapper;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zajan on 23.02.2017.
 */
public class AuthorizationRouter extends AbstractRouterHandler{

    private LoginHundler loginHundler;
    private RegistrationHundler registrationHundler;
    private JacksonDataMapper convertor = new JacksonDataMapper();

    Map<String, Handler> hundlerMap = new HashMap<String, Handler>();

    @Autowired
    public AuthorizationRouter(LoginHundler loginHundler, RegistrationHundler registrationHundler) {
        this.loginHundler = loginHundler;
        this.registrationHundler = registrationHundler;
        this.init();
    }


    public void init()
    {
        hundlerMap.put(loginHundler.getName(), loginHundler);
        hundlerMap.put(registrationHundler.getName(), registrationHundler);
    }

    public String getName() {
        return "Authorization";
    }

    public String getRouteKey(Request<?> msg)
    {
       return msg.getHeader().getCommand();
    }




}
