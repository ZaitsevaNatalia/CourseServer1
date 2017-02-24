package com.softgroup.common.router.api;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractRouterHandler<T extends Handler> implements RouterHandler {

	protected Map<String, Handler> hundlerMap = new HashMap<String, Handler>();

	@Override
	public Response<?> handle(Request<?> msg)
	{
		Handler handler = hundlerMap.get(getRouteKey(msg));
		return handler.handle(msg);
	}
}
