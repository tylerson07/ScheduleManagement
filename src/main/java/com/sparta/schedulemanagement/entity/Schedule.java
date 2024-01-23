package com.sparta.schedulemanagement.entity;

import com.sparta.schedulemanagement.dto.ScheduleRequestDto;
import com.sparta.schedulemanagement.dto.ScheduleResponseDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Schedule {
    private String Sname;
    private String Scontent;
    private String Supervisor;
    private int password;

    public Schedule(ScheduleRequestDto requestDto) {
        this.Sname = requestDto.getSname();
        this.Scontent = requestDto.getScontent();
        this.Supervisor = requestDto.getSupervisor();
        this.password = requestDto.getPassword();
    }
}
