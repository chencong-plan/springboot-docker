package cc.ccoder.sprintboot.mail;

public interface MailService {

    void sendSimpleMail(String to,String subject,String content);
}
