package com.chen.consumeruser;

import java.util.concurrent.*;

import org.junit.Test;

/**
 * Create by wuchenchen  on 2020/7/17
 */
public class TestThread {

    @Test
    public  void testThread1() {
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
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(index);
                }
            });
        }
    }

    @Test
    public void testThread2 (){
        //指定工作线程数量的线程池
        ///ExecutorService fixThreadPool = Executors.newFixedThreadPool(12);
        ExecutorService fixThreadPool =  new ThreadPoolExecutor(3, 3,
                1L, TimeUnit.HOURS,
                new LinkedBlockingQueue<Runnable>());
        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName());
            final int index = i;
            fixThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println(index);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}
