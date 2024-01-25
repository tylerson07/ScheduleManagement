package com.sparta.schedulemanagement.entity;

import com.sparta.schedulemanagement.dto.ScheduleRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Schedule {
    private String sname;
    private String scontent;
    private String supervisor;
    private int password;
    private String date;

    public Schedule(ScheduleRequestDto requestDto) {
        this.sname = requestDto.getSname();
        this.scontent = requestDto.getScontent();
        this.supervisor = requestDto.getSupervisor();
        this.password = requestDto.getPassword();
        this.date = requestDto.getDate();
    }

    public void update(ScheduleRequestDto requestDto) {
        this.sname = requestDto.getSname();
        this.scontent = requestDto.getScontent();
        this.supervisor = requestDto.getSupervisor();
        this.password = requestDto.getPassword();
        this.date = requestDto.getDate();
    }
}
