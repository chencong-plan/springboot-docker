package cc.ccoder.sprintboot.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class TestSchedule {

    private int count = 0;

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    @Scheduled(cron="*/6 * * * * ?")
    public void printTime(){
        System.out.println("已运行: "+(count++));
        System.out.println("当前时间: "+ dateFormat.format(new Date()));
        System.out.println("====================================");
    }
}
