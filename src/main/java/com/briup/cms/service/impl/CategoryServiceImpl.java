package com.briup.cms.service.impl;

import com.briup.cms.bean.Category;
import com.briup.cms.bean.Customer;
import com.briup.cms.bean.ex.CategoryEX;
import com.briup.cms.dao.ICateogoryDao;
import com.briup.cms.dao.ex.ICategoryEXDao;
import com.briup.cms.exception.CustomerException;
import com.briup.cms.service.ICategoryService;
import com.briup.cms.util.CodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: jd1913-cms
 * @description:
 * @author: wangzh
 * @create: 2019-11-26 16:03
 **/
@Service
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    private ICateogoryDao cateogoryDao;

    @Autowired
    private ICategoryEXDao categoryEXDao;


    @Override
    public void saveOrUpdateCategory(Category category) throws CustomerException {
        if (category == null) {
            throw new CustomerException(CodeUtil.PARAM_NULL,"参数为空");
        }
        cateogoryDao.save(category);
    }

    @Override
    public void deleteById(int id) throws CustomerException {
        cateogoryDao.deleteById(id);
    }

    @Override
    public Category findById(int id) throws CustomerException {
        return cateogoryDao.queryById(id);
    }

    @Override
    public List<Category> findAll() throws CustomerException {
        return cateogoryDao.findAll();
    }

    @Override
    public List<CategoryEX> findAllCategoryEX() throws CustomerException {
        return categoryEXDao.findAll();
    }
}
