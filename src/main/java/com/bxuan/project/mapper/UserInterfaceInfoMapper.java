package com.bxuan.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bxuan.bxuanapicommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
* @author 86150
* @description 针对表【user_interface_info(用户调用接口关系表)】的数据库操作Mapper
* @createDate 2023-04-03 13:27:16
* @Entity com.bxuan.project.model.entity.UserInterfaceInfo
*/
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {
    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}




