package com.example.demo.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.common.vo.LastPageReq;
import com.example.demo.user.entity.User;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Ryan
 * @since 2021-06-18
 */
public interface IUserService extends IService<User> {

    List<User> getPage(LastPageReq<User> req);
}
