package com.example.demo.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.common.vo.LastPageReq;
import com.example.demo.user.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author Ryan
 * @since 2021-06-18
 */
@Component
public interface UserMapper extends BaseMapper<User> {

    List<User> getPageAsc(LastPageReq<User> req);

    List<User> getPageDesc(LastPageReq<User> req);
}
