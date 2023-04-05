package com.bxuan.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bxuan.bxuanapicommon.model.entity.InterfaceInfo;

/**
* @author 86150
* @description 针对表【interface_info(接口信息表)】的数据库操作Service
* @createDate 2022-11-26 13:26:36
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);

}
