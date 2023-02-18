package com.hc.test.dao;

import com.hc.test.model.HcUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface HcUserDao {
    List<HcUser> getList();
}
