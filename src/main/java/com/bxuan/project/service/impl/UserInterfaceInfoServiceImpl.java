package com.bxuan.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bxuan.project.model.entity.UserInterfaceInfo;
import com.bxuan.project.service.UserInterfaceInfoService;
import com.bxuan.project.mapper.UserInterfaceInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author 86150
* @description 针对表【user_interface_info(用户调用接口关系表)】的数据库操作Service实现
* @createDate 2023-04-03 13:27:16
*/
@Service
public class UserInterfaceInfoServiceImpl extends ServiceImpl<UserInterfaceInfoMapper, UserInterfaceInfo>
    implements UserInterfaceInfoService{

}




