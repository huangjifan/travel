package com.xingying.travel.listener;

import com.aliyuncs.exceptions.ClientException;

import com.xingying.travel.util.SmsUtil;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Title: 监听队列
 * @author: 陈宏松
 * @create: 2018-12-22 20:06
 * @version: 1.0.0
 **/
@Component
@RabbitListener(queues = "sms")
public class Smslistenner {

    @Autowired
    private SmsUtil smsUtil;

    @Value("${aliyun.sms.template_code}")
    private String template_code;

    @Value("${aliyun.sms.sign_name}")
    private String sign_name;


    @RabbitHandler
    public void executeSms(Map<String,String>map)  {

        String mobile = map.get("mobile");
        String checkcode = map.get("checkcode");
        try {
            System.out.println("监听到SMS队列");
            smsUtil.sendSms(mobile,template_code,"YHG旅游服务网","{\"code\":\""+checkcode+"\"}");
            System.out.println("阿里短信服务请求完毕！");
        } catch (ClientException e) {
            e.printStackTrace();
        }

    }
}
