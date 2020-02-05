package com.autoschedule.schedule.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Cron {

    @TableId(type = IdType.AUTO)
    private Integer id;

    @TableField(value = "send_time")
    private String sendTime;

    @TableField(value = "status")
    private Integer status;

    @TableField(value = "cron_str")
    private String cronStr;
}