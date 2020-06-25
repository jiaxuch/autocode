package com.jiaxuch.code.service;

import com.jiaxuch.code.mapper.AreaMapper;
import com.jiaxuch.code.model.AreaInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jiaxuch
 * @date 2020/6/25
 */
@Service
public class AreaService {
    @Autowired
    AreaMapper areaMapper;


    public AreaInfo getArea() {
        return areaMapper.getArea();
    }
}
