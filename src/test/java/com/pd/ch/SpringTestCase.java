package com.pd.ch;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Description:
 * @author: youpd@asiainfo.com
 * @create: 2018-03-12 17:14
 */
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:spring_*.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringTestCase extends AbstractJUnit4SpringContextTests {

}