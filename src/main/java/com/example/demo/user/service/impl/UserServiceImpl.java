package com.example.demo.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.common.constant.OrderDirectEnum;
import com.example.demo.common.vo.LastPageReq;
import com.example.demo.user.entity.User;
import com.example.demo.user.mapper.UserMapper;
import com.example.demo.user.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Ryan
 * @since 2021-06-18
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> getPage(LastPageReq<User> req) {
        OrderDirectEnum direct = req.getDirect();
        if (direct.equals(OrderDirectEnum.ASC)) {
            return userMapper.getPageAsc(req);
        } else {
            return userMapper.getPageDesc(req);
        }

    }
}
