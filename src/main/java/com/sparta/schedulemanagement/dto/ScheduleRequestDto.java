package com.sparta.schedulemanagement.dto;

import lombok.Getter;

@Getter
public class ScheduleRequestDto {

    private String sname;
    private String scontent;
    private String supervisor;
    private int password;
    private String date;
}
