package com.sinotopia.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.sinotopia.api.UserInfoApi;
import com.sinotopia.api.dubbo.pojo.T_user;
import com.sinotopia.api.dubbo.service.T_userService;
import com.sinotopia.api.dubbo.util.CommonUtil;
import com.sinotopia.dto.UserInfoReq;
import com.sinotopia.dto.UserInfoRsp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Function:
 * @author chenjiec
 * Date: 2017/4/4 下午9:51
 * @since JDK 1.7
 */
@Service
public class UserInfoApiImpl implements UserInfoApi {
    private static Logger logger = LoggerFactory.getLogger(UserInfoApiImpl.class);

    @Autowired
    private T_userService t_userService ;

    /**
     * 获取用户信息
     *
     * @param userInfoReq
     * @return
     * @throws Exception
     */
    @Override
    public UserInfoRsp getUserInfo(UserInfoReq userInfoReq) throws Exception {
        logger.info("用户查询Id="+userInfoReq.getId());

        //返回对象
        UserInfoRsp userInfoRsp = new UserInfoRsp() ;
        T_user t_user = t_userService.selectByPrimaryKey(userInfoReq.getId()) ;

        //构建
        buildUserInfoRsp(userInfoRsp,t_user) ;

        return userInfoRsp;
    }


    /**
     * 构建返回
     * @param userInfoRsp
     * @param t_user
     */
    private void buildUserInfoRsp(UserInfoRsp userInfoRsp, T_user t_user) {
        if (t_user ==  null){
            t_user = new T_user() ;
        }
        CommonUtil.setLogValueModelToModel(t_user,userInfoRsp);
    }
}
