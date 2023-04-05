package com.bxuan.project.model.vo;

import com.bxuan.bxuanapicommon.model.entity.InterfaceInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Author: BXuan
 * @Date: 2023/04/05/ 15:35
 * @description 接口数据视图
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class InterfaceInfoVO extends InterfaceInfo {

    private int totalNum;

    private static final long serialVersionUID = 1L;
}
