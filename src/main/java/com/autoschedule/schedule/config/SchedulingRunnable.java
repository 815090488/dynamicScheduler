package com.autoschedule.schedule.config;

import com.autoschedule.schedule.model.Cron;

/**
 * 添加Runnable接口实现类，被定时任务线程池调用，用来执行指定bean里面的方法。
 * @author 81509
 */
public class SchedulingRunnable implements Runnable {


    private Cron cron;

    public SchedulingRunnable(Cron cron) {
        this.cron = cron;
    }

    @Override
    public void run() {
        //执行任务
        System.out.println("执行任务");
    }
}
