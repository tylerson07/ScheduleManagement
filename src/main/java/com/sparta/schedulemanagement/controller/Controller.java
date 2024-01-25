package com.sparta.schedulemanagement.controller;

import com.sparta.schedulemanagement.dto.ScheduleRequestDto;
import com.sparta.schedulemanagement.entity.Schedule;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class Controller {
private Map<Integer,Schedule> ScheduleList = new HashMap<>();

Integer count = 0;
@PostMapping("/Schedule")
public Schedule createSchedule(@RequestBody ScheduleRequestDto requestDto){
    Schedule schedule = new Schedule(requestDto);


     ScheduleList.put(count, schedule);
    count++;

    return schedule;

}
@GetMapping("/Schedule")
public List<Schedule> getSchedule(){
    List<Schedule> ListSchedule= new ArrayList<>();
     for(int i=0;i<ScheduleList.size();i++){
          ListSchedule.add(ScheduleList.get(i));

     }
   return ListSchedule;
}

@PutMapping("/memos/{id}")
    public String updateMemo(@PathVariable Integer count, @RequestBody ScheduleRequestDto requestDto){
    if(ScheduleList.containsKey(count)){
          Schedule schedule = ScheduleList.get(count);
          schedule.update(requestDto);
            return "updated changes";
    } else {
        throw new IllegalArgumentException("존재하지 않습니다");
    }

}
@DeleteMapping("/memos/id")
    public String deleteSchedule(@PathVariable Integer count, @RequestBody ScheduleRequestDto requestDto,@PathVariable int password){
    if(ScheduleList.containsKey(count)){
        if(ScheduleList.get(count).getPassword()==password) {
            ScheduleList.remove(count);
            return "deleted schedule";
        }else {throw new IllegalArgumentException("비밀번호가 일치하지읺습니다");}
    } else {
        throw new IllegalArgumentException("존재하지 않습니다");
    }

}

}
