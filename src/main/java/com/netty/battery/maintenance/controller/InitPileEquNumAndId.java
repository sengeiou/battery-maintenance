package com.netty.battery.maintenance.controller;


import com.netty.battery.maintenance.netty.server.NettyServer;
import com.netty.battery.maintenance.pojo.BasChaPilPojo;
import com.netty.battery.maintenance.service.serviceImpl.ChargingServiceImpl;
import com.netty.battery.maintenance.util.EhcacheUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;



/*


@Component
@Order(value = 2)
public class InitPileEquNumAndId implements ApplicationRunner {


    @Autowired
    private ChargingServiceImpl chargingService;


    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {

        EhcacheUtil ehcache = EhcacheUtil.getInstance();

        List<BasChaPilPojo> pileList = chargingService.selChaIp(null,null);


        if (pileList.size() > 0){

            for (BasChaPilPojo pojo : pileList){

                ehcache.put(pojo.getChaNum(),pojo.getChaId());

            }

        }

        System.out.println("023-------------------------------->"+ehcache.get("023"));










    }




}



*/
