package com.autoschedule.schedule.config;

import com.autoschedule.schedule.controller.CronController;
import com.autoschedule.schedule.model.Cron;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * spring boot 启动完成之后加载数据库中正常的定时任务
 *
 * @author 81509
 */
@Component
public class ScheduleConfig implements CommandLineRunner {


    @Autowired
    private CronTaskRegistrar taskRegistrar;

    @Autowired
    private CronController cronController;

    @Override
    public void run(String... args) throws Exception {
        List<Cron> crons = cronController.findCrons();
        for (Cron cron : crons) {
            //状态为1时为正常定时任务
            if (cron.getStatus() == 1) {
                SchedulingRunnable task = new SchedulingRunnable(cron);
                taskRegistrar.addCronTask(cron.getId(), task, cron.getCronStr());
            }
        }
    }

}