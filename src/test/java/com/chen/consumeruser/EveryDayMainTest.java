package com.chen.consumeruser;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Create by wuchenchen  on 2021/3/9
 */
@SpringBootTest
public class EveryDayMainTest {

    @Test
    public void test1(){
        List<String> list = new ArrayList<String>();
        list.add("aaa");
        list.remove(1);
        List<String> linkedList = new LinkedList<String>();
        linkedList.add("add");
    }
}
