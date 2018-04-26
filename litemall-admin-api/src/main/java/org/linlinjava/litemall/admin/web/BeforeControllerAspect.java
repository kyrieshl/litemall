package org.linlinjava.litemall.admin.web;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * create by BangZhuLi
 * 2018/4/17 13:51
 */
@Aspect
@Component
@Slf4j
public class BeforeControllerAspect {

    @Pointcut("execution(public * org.linlinjava.litemall.admin.web.*.*(..))")
    public void verify() {}


    @Before("verify()")
    public void doVerify() {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        HttpServletResponse response = attributes.getResponse();
        log.info("请求地址：{}",request.getRequestURI());
    }
}
