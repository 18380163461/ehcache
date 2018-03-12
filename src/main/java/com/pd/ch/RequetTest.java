package com.pd.ch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @author: youpd@asiainfo.com
 * @create: 2018-03-12 17:24
 */
@RestController
@RequestMapping("/RequetTest")
public class RequetTest {
    @Autowired
    private EhcacheService ehcacheService;

    @RequestMapping("/test1")
    @ResponseBody
    public String test1() {
        /*try {
            System.out.println("第一次调用：" + ehcacheService.getTimestamp("param"));
            Thread.sleep(2000);
            System.out.println("2秒之后调用：" + ehcacheService.getTimestamp("param"));
            Thread.sleep(4000);
            System.out.println("再过4秒之后调用：" + ehcacheService.getTimestamp("param"));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        return ehcacheService.getTimestamp("param");
    }

}
