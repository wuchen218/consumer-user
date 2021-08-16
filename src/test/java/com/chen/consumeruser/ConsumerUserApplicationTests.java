package com.chen.consumeruser;



import org.junit.Test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ConsumerUserApplicationTests {

    @Test
    void contextLoads() {
        //可缓存线程池
        ExecutorService cacheThreadPool = Executors.newCachedThreadPool();
        for(int i=0;i<10;i++){
            final int index = i;
            try {
                Thread.sleep(index*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cacheThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(index);
                }
            });
        }
    }

}
