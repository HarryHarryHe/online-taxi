package com.harry.cloudeureka.listen;

import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.stereotype.Component;

/**
 * @Description: online-taxi-three
 * @Author: Harry
 * @Date: 2020/11/22 21:17
 **/
@Component
public class TestEvent {

    public void listen(EurekaInstanceCanceledEvent event){
        //发邮件 短信..
        System.out.println("下线--"+event.getServerId());
    }

}
