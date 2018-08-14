package cc.ccoder.sprintboot.controller;

import cc.ccoder.sprintboot.mail.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableScheduling
public class HelloDockerController {

    @Autowired
    private MailService mailService;

    @RequestMapping("/hello")
    public String index() {
        return "hello Docker";
    }


    @RequestMapping("/hello/{name}")
    public String index(@PathVariable String name) {
        return "hello " + name;
    }

    @RequestMapping("/send/mail/{address}")
    public String sendMail(@PathVariable String address) {
        try {
            mailService.sendSimpleMail(address, "标题", "内容");
        } catch (Exception e) {
            return "发送邮件至: " + address + "失败，" + e.getMessage();
        }
        return "发送成功";
    }


}
