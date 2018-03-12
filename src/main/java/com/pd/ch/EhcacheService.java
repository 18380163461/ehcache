package com.pd.ch;

import com.pd.ch.entity.User;

/**
 * @Description:
 * @author: youpd@asiainfo.com
 * @create: 2018-03-12 16:02
 */
public interface EhcacheService {
    // 测试失效情况，有效期为5秒
    public String getTimestamp(String param);

    public String getDataFromDB(String key);

    public void removeDataAtDB(String key);

    public String refreshData(String key);


    public User findById(String userId);

    public boolean isReserved(String userId);

    public void removeUser(String userId);

    public void removeAllUser();
}
