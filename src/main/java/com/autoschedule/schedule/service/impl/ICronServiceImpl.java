package com.autoschedule.schedule.service.impl;


import com.autoschedule.schedule.mapper.CronMapper;
import com.autoschedule.schedule.model.Cron;
import com.autoschedule.schedule.service.ICronService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


/**
 * @author 81509
 */
@Service
public class ICronServiceImpl extends ServiceImpl<CronMapper, Cron> implements ICronService {
}
