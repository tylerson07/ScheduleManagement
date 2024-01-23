package com.sparta.schedulemanagement.controller;

import com.sparta.schedulemanagement.dto.ScheduleRequestDto;
import com.sparta.schedulemanagement.dto.ScheduleResponseDto;
import com.sparta.schedulemanagement.entity.Schedule;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class Controller {
private Map<Integer,Schedule> ScheduleList = new HashMap<>();

Integer Date=0;
public ScheduleResponseDto createSchedule(@RequestBody ScheduleRequestDto requestDto){
    Schedule schedule = new Schedule(requestDto);

     Date++;
     ScheduleList.put(Date,schedule);
      ScheduleResponseDto scheduleResponseDto = new ScheduleResponseDto(schedule);
      return scheduleResponseDto;

}

public List<ScheduleResponseDto> getSchedule(){

    return null;
}
}
