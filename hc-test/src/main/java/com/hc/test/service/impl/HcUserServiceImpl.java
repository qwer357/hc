package com.hc.test.service.impl;

import com.hc.test.dao.HcUserDao;
import com.hc.test.model.HcUser;
import com.hc.test.service.HcUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HcUserServiceImpl implements HcUserService {

    @Autowired
    HcUserDao hcUserDao;

    @Override
    public List<HcUser> getList() {

        return hcUserDao.getList();
    }
}
