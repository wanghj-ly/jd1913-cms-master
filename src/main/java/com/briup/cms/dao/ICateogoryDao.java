package com.briup.cms.dao;

import com.briup.cms.bean.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: jd1913-cms
 * @description:
 * @author: wangzh
 * @create: 2019-11-25 14:52
 **/
public interface ICateogoryDao extends JpaRepository<Category,Integer> {
    Category queryById(int id);
}
