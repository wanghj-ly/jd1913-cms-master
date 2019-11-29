package com.briup.cms.service;

import com.briup.cms.bean.Link;
import com.briup.cms.exception.CustomerException;

import java.util.List;

/**
 * @program: jd1913-cms
 * @description:
 * @author: wangzh
 * @create: 2019-11-25 15:25
 **/
public interface ILinkService {
    void saveOrUpdateLink(Link link) throws CustomerException;

    void deleteLink(int id) throws CustomerException;

    Link queryById(int id) throws  CustomerException;

    List<Link> getAllLink() throws CustomerException;
}
