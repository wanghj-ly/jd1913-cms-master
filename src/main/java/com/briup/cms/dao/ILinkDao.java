package com.briup.cms.dao;

import com.briup.cms.bean.Link;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: jd1913-cms
 * @description:
 * @author: wangzh
 * @create: 2019-11-25 14:50
 **/
public interface ILinkDao extends JpaRepository<Link,Integer> {
    Link queryById(int id);
}
