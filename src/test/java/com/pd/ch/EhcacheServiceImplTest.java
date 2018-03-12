package com.pd.ch;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * EhcacheServiceImpl Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>三月 12, 2018</pre>
 */

public class EhcacheServiceImplTest extends SpringTestCase {
    @Autowired
    private EhcacheService ehcacheService;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: getTimestamp(String param)
     */
    @Test
    public void testGetTimestamp() throws Exception {
        //TODO: Test goes here...
        System.out.println("第一次调用：" + ehcacheService.getTimestamp("param"));
        Thread.sleep(2000);
        System.out.println("2秒之后调用：" + ehcacheService.getTimestamp("param"));
        Thread.sleep(4000);
        System.out.println("再过4秒之后调用：" + ehcacheService.getTimestamp("param"));
    }

    /**
     * Method: getDataFromDB(String key)
     */
    @Test
    public void testGetDataFromDB() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: removeDataAtDB(String key)
     */
    @Test
    public void testRemoveDataAtDB() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: refreshData(String key)
     */
    @Test
    public void testRefreshData() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: findById(String userId)
     */
    @Test
    public void testFindById() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: isReserved(String userId)
     */
    @Test
    public void testIsReserved() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: removeUser(String userId)
     */
    @Test
    public void testRemoveUser() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: removeAllUser()
     */
    @Test
    public void testRemoveAllUser() throws Exception {
//TODO: Test goes here... 
    }


} 
