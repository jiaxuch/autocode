package com.jiaxuch.autocode.mapper;

import com.jiaxuch.autocode.example.AutoAreaExample;
import com.jiaxuch.autocode.model.AutoArea;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AutoAreaMapper {
    long countByExample(AutoAreaExample example);

    int deleteByExample(AutoAreaExample example);

    int deleteByPrimaryKey(Integer areaid);

    int insert(AutoArea record);

    int insertSelective(@Param("record") AutoArea record, @Param("selective") AutoArea.Column ... selective);

    AutoArea selectOneByExample(AutoAreaExample example);

    AutoArea selectOneByExampleSelective(@Param("example") AutoAreaExample example, @Param("selective") AutoArea.Column ... selective);

    List<AutoArea> selectByExampleSelective(@Param("example") AutoAreaExample example, @Param("selective") AutoArea.Column ... selective);

    List<AutoArea> selectByExample(AutoAreaExample example);

    AutoArea selectByPrimaryKeySelective(@Param("areaid") Integer areaid, @Param("selective") AutoArea.Column ... selective);

    AutoArea selectByPrimaryKey(Integer areaid);

    int updateByExampleSelective(@Param("record") AutoArea record, @Param("example") AutoAreaExample example, @Param("selective") AutoArea.Column ... selective);

    int updateByExample(@Param("record") AutoArea record, @Param("example") AutoAreaExample example);

    int updateByPrimaryKeySelective(@Param("record") AutoArea record, @Param("selective") AutoArea.Column ... selective);

    int updateByPrimaryKey(AutoArea record);

    int batchInsert(@Param("list") List<AutoArea> list);

    int batchInsertSelective(@Param("list") List<AutoArea> list, @Param("selective") AutoArea.Column ... selective);

    int upsert(AutoArea record);

    int upsertSelective(@Param("record") AutoArea record, @Param("selective") AutoArea.Column ... selective);
}