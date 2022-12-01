package com.swms.fms.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class InterceptorConfig implements HandlerInterceptor {

    private static final Logger log = LoggerFactory.getLogger(InterceptorConfig.class);


    public InterceptorConfig() {
    }

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "*");
        response.setHeader("Access-Control-Allow-Headers", "*");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Max-Age", "360000");
        response.setHeader("Accept-Ranges", "bytes");
        response.setHeader("Access-Control-Expose-Headers", "x-firc-token, Date, Etag, Server, Connection, Accept-Ranges, Content-Range, Content-Encoding, Content-Length, Content-Type, Content-Disposition, Last-Modified, Content-Language, Cache-Control, Retry-After, X-Amz-Bucket-Region, Expires, X-Amz*, X-Amz*, *");
        response.setHeader("Request-Time", System.currentTimeMillis() + "");
        return RequestMethod.OPTIONS.name().equals(request.getMethod()) ? true : true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object o, ModelAndView modelAndView) {
        long start = Long.parseLong(response.getHeader("Request-Time"));
        log.info("[{}][{}] {} {}  {}", new Object[]{request.getMethod(), response.getStatus(), System.currentTimeMillis() - start + "ms", request.getRemoteHost(), request.getServletPath()});
    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
    }
}

