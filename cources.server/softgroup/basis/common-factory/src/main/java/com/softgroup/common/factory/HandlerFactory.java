package com.softgroup.common.factory;

/**
 * Created by zajan on 28.02.2017.
 */
import com.softgroup.common.protocol.Request;
import com.softgroup.common.router.api.Handler;

public interface HandlerFactory extends Handler
{
    Handler getHandler(Request<?> msg);
}
