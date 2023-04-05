package com.bxuan.project.service.impl.inner;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bxuan.bxuanapicommon.model.entity.InterfaceInfo;
import com.bxuan.bxuanapicommon.service.InnerInterfaceInfoService;
import com.bxuan.project.common.ErrorCode;
import com.bxuan.project.exception.BusinessException;
import com.bxuan.project.mapper.InterfaceInfoMapper;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * @Author: BXuan
 * @Date: 2023/04/05/ 14:20
 * @description
 */
@DubboService
public class InnerInterfaceInfoServiceImpl implements InnerInterfaceInfoService {

    @Resource
    private InterfaceInfoMapper interfaceInfoMapper;

    @Override
    public InterfaceInfo getInterfaceInfo(String path, String method) {
        if (StringUtils.isAnyBlank(path, method)){
            throw new BusinessException(ErrorCode.SYSTEM_ERROR, "请求参数错误！");
        }
        QueryWrapper<InterfaceInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("path", path);
        queryWrapper.eq("method", method);
        return interfaceInfoMapper.selectOne(queryWrapper);
    }
}
