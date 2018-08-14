package cc.ccoder.sprintboot.mail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MailServiceImplTest {

    @Autowired
    private MailService mailService;

    @Test
    public void testSimpleMail() throws Exception{
        mailService.sendSimpleMail("1042738887@qq.com","简单邮件标题","简单邮件内容");
    }
}