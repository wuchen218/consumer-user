package com.chen.consumeruser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController extends CommonLogInfoController{
    private int i = 0;
    @Autowired
    public  RestTemplate restTemplate;

    @GetMapping("/buyTicket")
    public String buyTicket (String name){
        i++;
        String ne = "";
        ne = restTemplate.getForObject("http://PROVIDER-TICKER/getTicket",String.class);
        logger.info("调用服务方成功"+i);
        return i + "购买了"+ne;
    }
    @GetMapping("/buy")
    public String buyTicket (){
        return "购买了";
    }
    /**
      * @Author: wuchenchen on 2020/7/3 15:02
      * @param: 
      * @return: 
      * @Description:
     */
    @GetMapping("getList")
    public Map getList(String name){
        HashMap<String,Object> map = new HashMap<String,Object>();
        name = "nihao";
        List list = restTemplate.getForObject("http://PROVIDER-TICKER/getList",List.class);
        map.put("list",list);
        map.put("list",list);
        return map;
    }
}
