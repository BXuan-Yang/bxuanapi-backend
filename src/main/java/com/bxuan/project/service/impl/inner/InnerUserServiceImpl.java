package com.bxuan.project.service.impl.inner;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bxuan.bxuanapicommon.model.entity.User;
import com.bxuan.bxuanapicommon.service.InnerUserService;
import com.bxuan.project.common.ErrorCode;
import com.bxuan.project.exception.BusinessException;
import com.bxuan.project.mapper.UserMapper;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * @Author: BXuan
 * @Date: 2023/04/05/ 14:22
 * @description
 */
@DubboService
public class InnerUserServiceImpl implements InnerUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User getInvokeUser(String accessKey) {
        if (StringUtils.isBlank(accessKey)){
            throw  new BusinessException(ErrorCode.SYSTEM_ERROR, "用户 ak 参数错误");
        }
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("accessKey", accessKey);
        return userMapper.selectOne(queryWrapper);
    }
}
