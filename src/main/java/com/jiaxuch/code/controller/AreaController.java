package com.jiaxuch.code.controller;

import com.jiaxuch.code.model.AreaInfo;
import com.jiaxuch.code.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiaxuch
 * @date 2020/6/25
 */
@RestController
public class AreaController {
    @Autowired
    AreaService areaService;

    @GetMapping("/area")
    public Object getArea(){
       AreaInfo areaInfo = areaService.getArea();
       return areaInfo;
    }
}
