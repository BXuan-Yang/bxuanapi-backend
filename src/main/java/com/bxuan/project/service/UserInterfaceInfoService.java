package com.bxuan.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bxuan.bxuanapicommon.model.entity.UserInterfaceInfo;

/**
* @author 86150
* @description 针对表【user_interface_info(用户调用接口关系表)】的数据库操作Service
* @createDate 2023-04-03 13:27:16
*/
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {

    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);

    boolean invokeCount(long interfaceInfoId, long userId);

}
