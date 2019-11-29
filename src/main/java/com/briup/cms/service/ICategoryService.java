package com.briup.cms.service;

import com.briup.cms.bean.Category;
import com.briup.cms.bean.ex.CategoryEX;
import com.briup.cms.exception.CustomerException;

import java.util.List;

/**
 * @program: jd1913-cms
 * @description:
 * @author: wangzh
 * @create: 2019-11-26 16:02
 **/
public interface ICategoryService {
    void saveOrUpdateCategory(Category category) throws CustomerException;

    void deleteById(int id) throws CustomerException;

    Category findById(int id) throws  CustomerException;

    List<Category> findAll() throws CustomerException;

    List<CategoryEX> findAllCategoryEX() throws CustomerException;
}
