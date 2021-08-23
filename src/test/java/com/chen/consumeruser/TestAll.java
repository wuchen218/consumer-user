package com.chen.consumeruser;

import org.junit.Test;

import javax.lang.model.util.SimpleAnnotationValueVisitor6;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Create by wuchenchen  on 2021/8/20
 */
public class TestAll {
    @Test
    public void test1(){
        SimpleDateFormat sdf = new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat dateFormat = new  SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        try {
            Date date = sdf.parse("2021-08-20 16:31:11");
            String date1 = dateFormat.format(date);
            System.out.println(date);
            System.out.println(date1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
