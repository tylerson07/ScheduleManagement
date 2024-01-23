package com.sparta.schedulemanagement.dto;

import com.sparta.schedulemanagement.entity.Schedule;
import lombok.Getter;

@Getter
public class ScheduleResponseDto {

    private String Sname;
    private String Scontent;
    private String Supervisor;
    private int password;


    public ScheduleResponseDto(Schedule schedule) {
        this.Sname = schedule.getSname();
        this.Scontent = schedule.getScontent();
        this.Supervisor = schedule.getSupervisor();
        this.password = schedule.getPassword();
    }
}
