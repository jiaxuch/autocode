package com.jiaxuch.code.mapper;

import com.jiaxuch.code.model.AreaInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author jiaxuch
 * @date 2020/6/25
 */
@Mapper
public interface AreaMapper {
    AreaInfo getArea();
}
