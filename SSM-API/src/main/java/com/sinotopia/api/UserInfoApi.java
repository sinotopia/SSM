package com.sinotopia.api;

import com.sinotopia.dto.UserInfoReq;
import com.sinotopia.dto.UserInfoRsp;

/**
 * Function:用户API
 * @author chenjiec
 * Date: 2017/4/4 下午9:46
 * @since JDK 1.7
 */
public interface UserInfoApi {

    /**
     * 获取用户信息
     * @param userInfoReq
     * @return
     * @throws Exception
     */
    public UserInfoRsp getUserInfo(UserInfoReq userInfoReq) throws Exception;
}
