package com.chen.consumeruser;

import org.junit.Test;

/**
 * Create by wuchenchen  on 2021/1/11
 */
public class MainTest {

    public static void main(String[] args) {

    }


    @Test
    public void test1() {
        String fileName = "你好.四点零分.txt";
        String name = fileName.substring(0, fileName.lastIndexOf("."));
        String formatName = fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length());
        System.out.println("name:" + name);
        System.out.println("formatName:" + formatName);

    }
}
