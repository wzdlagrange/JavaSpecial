package mail.factory;

/**
 * @author Created by 谭健 on 2018/3/28 0028. 星期三. 14:40.
 * © All Rights Reserved.
 */
public class MailPort {


    public static final String


    /**
     * 25端口为SMTP（Simple Mail Transfer Protocol，简单邮件传输协议）服务所开放的，是用于发送邮件。
     * 如今绝大多数邮件服务器都使用该协议。当你给别人发送邮件时，你的机器的某个动态端口（大于1024）就会与邮件服务器的25号端口建立一个连接，
     * 你发送的邮件就会通过这个连接传送到邮件服务器上，保存起来。
     */
    SMTP_25 = "25",

    /**
     * 109端口是为POP2（Post Office Protocol Version 2，邮局协议2）服务开放的，是用于接收邮件的。
     */
    POP2_109 = "109",

    /**
     * 110端口是为POP3（Post Office Protocol Version 3，邮局协议3）服务开放的，是用于接收邮件的。
     */
    POP3_110 = "110",

    /**
     * 143端口是为IMAP（INTERNET MESSAGE ACCESS PROTOCOL）服务开放的，是用于接收邮件的。
     */
    IMAP_143 = "143",

    /**
     * 465端口是为SMTPS（SMTP-over-SSL）协议服务开放的，这是SMTP协议基于SSL安全协议之上的一种变种协议，
     * 它继承了SSL安全协议的非对称加密的高度安全可靠性，可防止邮件泄露。SMTPS和SMTP协议一样，也是用来发送邮件的，
     * 只是更安全些，防止邮件被黑客截取泄露，还可实现邮件发送者抗抵赖功能。防止发送者发送之后删除已发邮件，拒不承认发送过这样一份邮件。
     */
    SMTPS_465 = "465",

    /**
     * 587端口是STARTTLS协议的 属于TLS通讯协议 只是他是在STARTTLS命令执行后才对之后的原文进行保护的。
     */
    SMTP_587 = "587",

    /**
     * 993端口是为IMAPS（IMAP-over-SSL）协议服务开放的，这是IMAP协议基于SSL安全协议之上的一种变种协议，
     * 它继承了SSL安全协议的非对称加密的高度安全可靠性，可防止邮件泄露。IMAPS和IMAP协议一样，也是用来接收邮件的，
     * 只是更安全些，防止邮件被黑客截取泄露，还可实现邮件接收方抗抵赖功能。防止收件者收件之后删除已收邮件，拒不承认收到过这样一封邮件。
     */
    IMAPS_993 = "993",

    /**
     * 995端口是为POP3S（POP3-over-SSL）协议服务开放的，这是POP3协议基于SSL安全协议之上的一种变种协议，
     * 它继承了SSL安全协议的非对称加密的高度安全可靠性，可防止邮件泄露。POP3S和POP3协议一样，也是用来接收邮件的，
     * 只是更安全些，防止邮件被黑客截取泄露，还可实现邮件接收方抗抵赖功能。防止收件者收件之后删除已收邮件，拒不承认收到过这样一封邮件。
     */
    POP3S_995_SSL = "995";
}
